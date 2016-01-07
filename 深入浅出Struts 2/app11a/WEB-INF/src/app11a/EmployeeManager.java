package app11a;
import java.util.List;
import app11a.Employee;
import app11a.dao.DAOException;
import app11a.dao.DAOFactory;
import app11a.dao.EmployeeDAO;

public class EmployeeManager {
    public static List<Employee> getEmployees() {
        return search(new EmployeeSearchCriteria());
    }
    
    public static void create(Employee employee) {
        EmployeeDAO employeeDAO = DAOFactory.getInstance().getEmployeeDAO();
        try {
            employeeDAO.createEmployee(employee);
        } catch (DAOException e) {
        }
    }

    public static void delete(int employeeId) {
        EmployeeDAO employeeDAO = DAOFactory.getInstance().getEmployeeDAO();
        try {
            employeeDAO.deleteEmployee(employeeId);
        } catch (DAOException e) {
        }
    }

    public static Employee find(int employeeId) {
        EmployeeDAO employeeDAO = DAOFactory.getInstance().getEmployeeDAO();
        try {
            return employeeDAO.getEmployee(employeeId);
        } catch (DAOException e) {
        }
        return null;
    }
    
    public static void update(Employee employee) {
        EmployeeDAO employeeDAO = DAOFactory.getInstance().getEmployeeDAO();
        try {
            employeeDAO.updateEmployee(employee);
        } catch (DAOException e) {
        }
    }
    
    public static List<Employee> search(EmployeeSearchCriteria criteria) {
        EmployeeDAO employeeDAO = DAOFactory.getInstance().getEmployeeDAO();
        try {
            return employeeDAO.searchEmployees(criteria);
        } catch (DAOException e) {
        }
        return null;
    }

}
