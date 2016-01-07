package app11a.dao;
import app11a.Employee;
import app11a.EmployeeSearchCriteria;
import java.util.List;

public interface EmployeeDAO {
    public void createEmployee(Employee employee) throws DAOException;
    public void updateEmployee(Employee customer) throws DAOException;
    public Employee getEmployee(int employeeId) throws DAOException;
    public void deleteEmployee(int employeeId) throws DAOException;
    public List<Employee> searchEmployees(EmployeeSearchCriteria searchCriteria)
            throws DAOException;
}
