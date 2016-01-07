package app11a.listener;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String dataSourceJndiName = servletContext
                .getInitParameter("dataSourceJndiName");
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup(dataSourceJndiName);
            servletContext.setAttribute("dataSource", dataSource);
        } catch (NamingException e) {
            throw new RuntimeException();
        }
    }

    public void contextDestroyed(ServletContextEvent cse) {
    }
}
