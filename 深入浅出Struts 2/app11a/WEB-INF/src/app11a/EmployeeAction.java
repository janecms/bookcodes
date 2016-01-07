package app11a;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.List;

public class EmployeeAction extends ActionSupport 
        implements Preparable, ModelDriven {
    private Employee employee;
    private int employeeId;
    private List<Employee> employees;
    
    public void prepare() throws Exception {
        if (employeeId == 0) {
            employee = new Employee();
        } else {
            employee = EmployeeManager.find(employeeId);
        }
    }
    
    public Object getModel() {
        return employee;
    }
    
    
    public List<Employee> getEmployees() {
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
    public String edit() {
        return SUCCESS;
    }
    public String update() {
        EmployeeManager.update(employee);
        employees = EmployeeManager.getEmployees();
        return SUCCESS;
    }
    public String delete() {
        EmployeeManager.delete(employeeId);
        employees = EmployeeManager.getEmployees();
        return SUCCESS;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
