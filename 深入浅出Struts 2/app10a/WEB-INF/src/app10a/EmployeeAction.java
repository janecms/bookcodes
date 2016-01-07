package app10a;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;

public class EmployeeAction extends ActionSupport 
        implements ModelDriven {
    
    private Employee employee;
    private List<Employee> employees;

    public Object getModel() {
        employee = new Employee();
        return employee;
    }
    
    public List<Employee> getEmployees() {
        employees = EmployeeManager.getEmployees();
        return employees;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public String list() {
        employees = EmployeeManager.getEmployees();
        return SUCCESS;
    }
    public String create() {
        EmployeeManager.create(employee);
        return SUCCESS;
    }
    

}
