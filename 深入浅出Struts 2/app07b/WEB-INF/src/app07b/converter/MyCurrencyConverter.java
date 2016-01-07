package app07b.converter;

import java.lang.reflect.Member;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import ognl.TypeConverter;
import com.opensymphony.xwork2.util.TypeConversionException;

public class MyCurrencyConverter implements TypeConverter {
    public Object convertValue(Map context, Object target, 
            Member member, String propertyName, Object value, 
            Class toType) {
        System.out.println("target:" + target);
        System.out.println("member:" + member);
        System.out.println("property name:" + propertyName);
        if (toType == String.class) {
            NumberFormat formatter = new DecimalFormat("#,##0.00");
            return formatter.format((Double) value);
        } else if (toType == Double.class || toType == Double.TYPE) {
            try {
                String[] s = (String[]) value;
                String doubleValue = s[0];
                // remove commas, 
                // we could use a one-line regular expression, 
                // String doubleValue = s[0].replaceAll("[,]", "");
                // but regular expressions are comparatively 
                // much slower
                return Double.parseDouble(
                        replaceString(doubleValue, ',', ""));
            } catch (NumberFormatException e) {
                System.out.println("Error:" + e);
                throw new TypeConversionException("Wrong");
            }
        }
        return null;
    }

    
    public static String replaceString(String s, char c, String with) {
        if (s == null) {
            return null;
        }
        int length = s.length();
        StringBuilder sb = new StringBuilder(s.length() * 2);
        for (int i = 0; i < length; i++) {
            char c2 = s.charAt(i);
            if (c2 == c) {
                sb.append(with);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

}
