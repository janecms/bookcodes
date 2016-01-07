package app10a;
import java.util.ArrayList;
import java.util.List;

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
}
