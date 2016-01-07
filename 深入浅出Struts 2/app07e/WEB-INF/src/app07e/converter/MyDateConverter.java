package app07e.converter;

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
System.out.println("MyDateConverter.convertValue. value:" + value);
System.out.println("MyDateConverter.convertValue. To Type:" + toType);        
//System.out.println("Context:" + context);     
//        ValueStack valueStack = (ValueStack) context.get(ValueStack.VALUE_STACK);
//        System.out.println(valueStack.findValue("datePattern"));
//
//        Object appMap = context.get("application");
//        System.out.println("appMap:"  + appMap) ;
//        if (toType == String.class) {
//            String datePattern = "MMM dd, yyyy";
//            DateFormat format = new SimpleDateFormat(datePattern);
//            return format.format(value);
//        } 
//        else 
        if (toType == Date.class) {
            String datePattern = "yyyy-MM-dd";
            DateFormat format = new SimpleDateFormat(datePattern);
            format.setLenient(false);
            try {
                String[] s = (String[]) value;
                System.out.println("length:" + s.length);                
                System.out.println("length:" + s[0]);                
                Date date = format.parse(s[0]);
                return date;
            } catch (ParseException e) {
                System.out.println("Error:" + e);
                throw new TypeConversionException("Wrong");
            }
        }
        return null;
    }

}
