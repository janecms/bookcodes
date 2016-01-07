package app07b.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletContext;
import org.apache.struts2.StrutsStatics;
import ognl.DefaultTypeConverter;
import com.opensymphony.xwork2.util.TypeConversionException;


public class MyDateConverter extends DefaultTypeConverter {

    public Object convertValue(Map context, Object value, Class toType) {
        if (toType == Date.class) {
            ServletContext servletContext = (ServletContext) 
                    context.get(StrutsStatics.SERVLET_CONTEXT);
            System.out.println("servletContext == null ?" + servletContext==null);        
            System.out.println("servletContext getClass:"+servletContext.getClass());
            String datePattern = servletContext.getInitParameter("datePattern");
            System.out.println("date pattern:" + datePattern);

            DateFormat format = new SimpleDateFormat(datePattern);
            format.setLenient(false);
            try {
                String[] s = (String[]) value;
                Date date = format.parse(s[0]);
                return date;
            } catch (ParseException e) {
                System.out.println("Error:" + e);
                throw new TypeConversionException("Invalid conversion");
            }
        }
        return null;
    }
}
