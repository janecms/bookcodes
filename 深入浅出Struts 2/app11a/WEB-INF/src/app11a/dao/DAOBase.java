package app11a.dao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;
import org.apache.struts2.ServletActionContext;

public class DAOBase implements DAO {
    public Connection getConnection() throws DAOException {
        ServletContext servletContext = ServletActionContext.
                getServletContext();
        DataSource dataSource = (DataSource) 
                servletContext.getAttribute("dataSource");
        Connection connection = null;
        if (dataSource != null) {
            try {
                connection = dataSource.getConnection();
            } catch (SQLException e) {
                System.out.println("DAOBase");
                throw new DAOException();
            }
        } 
        return connection;
    }
}
