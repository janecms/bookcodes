package com.apress.springrecipes.board.security;

import org.springframework.security.Authentication;
import org.springframework.security.ConfigAttribute;
import org.springframework.security.ConfigAttributeDefinition;
import org.springframework.security.ui.WebAuthenticationDetails;
import org.springframework.security.vote.AccessDecisionVoter;

public class IpAddressVoter implements AccessDecisionVoter {

    public static final String IP_PREFIX = "IP_";
    public static final String IP_LOCAL_HOST = "IP_LOCAL_HOST";

    public boolean supports(ConfigAttribute attribute) {
        return attribute.getAttribute() != null
                && attribute.getAttribute().startsWith(IP_PREFIX);
    }

    public boolean supports(Class clazz) {
        return true;
    }

    public int vote(Authentication authentication, Object object,
            ConfigAttributeDefinition config) {
        if (!(authentication.getDetails() instanceof WebAuthenticationDetails)) {
            return ACCESS_DENIED;
        }

        WebAuthenticationDetails details =
            (WebAuthenticationDetails) authentication.getDetails();
        String address = details.getRemoteAddress();

        int result = ACCESS_ABSTAIN;
        for (Object element : config.getConfigAttributes()) {
            ConfigAttribute attribute = (ConfigAttribute) element;

            if (this.supports(attribute)) {
                result = ACCESS_DENIED;
                if (IP_LOCAL_HOST.equals(attribute.getAttribute())) {
                    if (address.equals("127.0.0.1")) {
                        return ACCESS_GRANTED;
                    }
                }
            }
        }
        return result;
    }
}
