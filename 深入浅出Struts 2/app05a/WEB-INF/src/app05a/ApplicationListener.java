package app05a;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationListener 
        implements ServletContextListener {
    public void contextInitialized(ServletContextEvent cse) {
        Map<Integer, String> countries = 
                new HashMap<Integer, String>();
        countries.put(1, "US");
        countries.put(2, "Canada");
        countries.put(3, "Mexico");
        ServletContext servletContext = cse.getServletContext();
        servletContext.setAttribute("countries", countries);
    }
    public void contextDestroyed(ServletContextEvent cse) {
    }
}