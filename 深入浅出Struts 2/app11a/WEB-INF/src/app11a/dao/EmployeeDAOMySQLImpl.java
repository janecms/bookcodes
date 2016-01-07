package app11a.dao;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import app11a.Employee;
import app11a.EmployeeSearchCriteria;
import app11a.dao.DAOException;
import app11a.dao.DBUtil;


public class EmployeeDAOMySQLImpl extends DAOBase implements EmployeeDAO {
    private static final String CREATE_EMPLOYEE_SQL = 
            "INSERT INTO employees (firstName,lastName) VALUES (?, ?)";
    public void createEmployee(Employee customer) throws DAOException {
        Connection connection = null;
        PreparedStatement pStatement = null;
        try {
            connection = getConnection();
            // Prepare a statement to insert a record
            pStatement = connection.prepareStatement(CREATE_EMPLOYEE_SQL);
            pStatement.setString(1, customer.getFirstName());
            pStatement.setString(2, customer.getLastName());
            pStatement.executeUpdate();
            pStatement.close();
        } catch (SQLException ex) {
            throw new DAOException();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                throw new DAOException();
            }
        }
    }

    private static final String UPDATE_EMPLOYEE_SQL = 
            "UPDATE employees SET firstName=?, lastName=? WHERE id = ?";
    public void updateEmployee(Employee employee) throws DAOException {
        Connection connection = null;
        PreparedStatement pStatement = null;
        try {
            connection = getConnection();
            pStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);
            pStatement.setString(1, employee.getFirstName());
            pStatement.setString(2, employee.getLastName());
            pStatement.setInt(3, employee.getId());
            pStatement.executeUpdate();
            pStatement.close();
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
            }
        }
    }

    private static final String GET_EMPLOYEE_SQL = 
            "SELECT firstName, lastName FROM employees WHERE id = ?";
    public Employee getEmployee(int employeeId) throws DAOException {
        Connection connection = null;
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        Employee employee = new Employee();
        try {
            connection = getConnection();
            pStatement = connection.prepareStatement(GET_EMPLOYEE_SQL);
            pStatement.setInt(1, employeeId);
            rs = pStatement.executeQuery();
            if (rs.next()) {
                employee.setFirstName(rs.getString("firstName"));
                employee.setLastName(rs.getString("lastName"));
                employee.setId(employeeId);
            }
            rs.close();
            pStatement.close();
        } catch (SQLException ex) {
            throw new DAOException();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
            }
        }
        return employee;
    }

    private static final String DELETE_EMPLOYEE_SQL = 
            "DELETE FROM employees WHERE id = ?";
    public void deleteEmployee(int employeeId) throws DAOException {
        Connection connection = null;
        PreparedStatement pStatement = null;
        try {
            connection = getConnection();
            pStatement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);
            pStatement.setInt(1, employeeId);
            pStatement.executeUpdate();
            pStatement.close();
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
            }
        }
    }

    private static final String SEARCH_EMPLOYEES_SQL = 
            "SELECT id, firstName, lastName FROM employees WHERE ";
    public List<Employee> searchEmployees(EmployeeSearchCriteria searchCriteria)
            throws DAOException {

        List<Employee> employees = new ArrayList<Employee>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // Build the search criterias
        StringBuilder criteriaSql = new StringBuilder(512);
        criteriaSql.append(SEARCH_EMPLOYEES_SQL);
        if (searchCriteria.getFirstName() != null) {
            criteriaSql.append("firstName LIKE '%"
                    + DBUtil.fixSqlFieldValue(searchCriteria.getFirstName())
                    + "%' AND ");
        }
        if (searchCriteria.getLastName() != null) {
            criteriaSql.append("lastName LIKE '%"
                    + DBUtil.fixSqlFieldValue(searchCriteria.getLastName())
                    + "%' AND ");
        }
        // Remove unused 'And' & 'WHERE'
        if (criteriaSql.substring(criteriaSql.length() - 5).equals(" AND "))
            criteriaSql.delete(criteriaSql.length() - 5,
                    criteriaSql.length() - 1);
        if (criteriaSql.substring(criteriaSql.length() - 7).equals(" WHERE "))
            criteriaSql.delete(criteriaSql.length() - 7,
                    criteriaSql.length() - 1);

        try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(criteriaSql.toString());
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("firstName"));
                employee.setLastName(resultSet.getString("lastName"));
                employees.add(employee);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
            }
        }
        return employees;
    }
}