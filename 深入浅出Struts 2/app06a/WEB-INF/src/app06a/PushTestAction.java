package app06a;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PushTestAction extends ActionSupport 
        implements SessionAware {
    private Map sessionMap;
    public void setSession(Map sessionMap) {
        this.sessionMap = sessionMap;
    }
    public String execute() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Karl");
        employee.setLastName("Popper");
        sessionMap.put("employee", employee);
        return SUCCESS;
    }
}

class Employee {
    private int id;
    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
