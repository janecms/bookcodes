package app10b;
import java.util.ArrayList;
import java.util.List;
import app10b.Employee;

public class EmployeeManager {
    private static List<Employee> employees;
    public static int id;
    static {
        employees = new ArrayList<Employee>();
        employees.add(new Employee(++id, "Rachel", "Greene"));
        employees.add(new Employee(++id, "Monica", "Geller"));
        employees.add(new Employee(++id, "Phoebe", "Buffay"));
        employees.add(new Employee(++id, "Joey", "Tribbiani"));
        employees.add(new Employee(++id, "Chandler", "Bing"));
        employees.add(new Employee(++id, "Ross", "Geller"));
    }
    
    public static List<Employee> getEmployees() {
        return employees;
    }
    
    public static void create(Employee employee) {
        employee.setId(++id);
        employees.add(employee);
    }
    public static void delete(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employees.remove(employee);
                break;
            }
        }
    }
    public static Employee find(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                System.out.println("found");
                return employee;
            }
        }
        return null;
    }
    public static void update(Employee employee) {
        int employeeId = employee.getId();
        for (Employee emp : employees) {
            if (emp.getId() == employeeId) {
                emp.setFirstName(employee.getFirstName());
                emp.setLastName(employee.getLastName());
                break;
            }
        }
        
    }
}
