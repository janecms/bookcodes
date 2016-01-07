package app11a.dao;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;

public class DAOFactory {
    private String databaseType;
    private static DAOFactory instance;
    static {
        instance = new DAOFactory();
    }
    private DAOFactory() {
        ServletContext servletContext = ServletActionContext
                .getServletContext();
        databaseType = servletContext.getInitParameter("dbType");
    }
    public static DAOFactory getInstance() {
        return instance;
    }
    public EmployeeDAO getEmployeeDAO() {
        if ("mysql".equalsIgnoreCase(databaseType)) {
            return new EmployeeDAOMySQLImpl();
        } else if ("oracle".equalsIgnoreCase(databaseType)) {
            // return new EmployeeDAOOracleImpl();
        } else if ("mssql".equalsIgnoreCase(databaseType)) {
            // return new EmployeeDAOMsSQLImpl();
        }
        return null;
    }
}
