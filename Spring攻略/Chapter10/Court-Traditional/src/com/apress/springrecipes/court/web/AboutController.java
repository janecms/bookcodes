package com.apress.springrecipes.court.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class AboutController extends ParameterizableViewController {

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        return new ModelAndView(getViewName(), "email", email);
    }
}
