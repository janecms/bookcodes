package app07d.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.util.TypeConversionException;
import com.opensymphony.xwork2.util.ValueStack;


public class MyDateConverter extends DefaultTypeConverter {

    public Object convertValue(Map context, Object value, Class toType) {
        if (toType == Date.class) {
            String datePattern = "yyyy-MM-dd";
            DateFormat format = new SimpleDateFormat(datePattern);
            format.setLenient(false);
            try {
                String[] s = (String[]) value;
                Date date = format.parse(s[0]);
                return date;
            } catch (ParseException e) {
                System.out.println("Error:" + e);
                throw new TypeConversionException("Invalid date.");
            }
        }
        return null;
    }

}
