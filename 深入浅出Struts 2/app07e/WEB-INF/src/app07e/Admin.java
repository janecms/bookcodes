package app07e;
import java.util.Collection;
import com.opensymphony.xwork2.ActionSupport;

public class Admin extends ActionSupport {
    private Collection employees;
    public Collection getEmployees() {
        return employees;
    }
    public void setEmployees(Collection employees) {
        this.employees = employees;
    }
}
