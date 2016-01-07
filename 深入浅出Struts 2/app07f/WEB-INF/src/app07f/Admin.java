package app07f;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class Admin extends ActionSupport {
    private Map employees;
    private String[] userName;
    public Map getEmployees() {
        return employees;
    }
    public void setEmployees(Map employees) {
        this.employees = employees;
    }
    public String[] getUserName() {
        return userName;
    }
    public void setUserName(String[] userName) {
        this.userName = userName;
    }
}
