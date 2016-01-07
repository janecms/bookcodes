package app07d;
import com.opensymphony.xwork2.ActionSupport;

public class Admin extends ActionSupport {
    private Employee employee;
    private String adminId;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employees) {
        this.employee = employees;
    }
    public String getAdminId() {
        return adminId;
    }
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    public String execute() {
        // code to insert the employee to the db here

        return SUCCESS;        
    }
}
