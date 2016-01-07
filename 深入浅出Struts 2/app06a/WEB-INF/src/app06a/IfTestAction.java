package app06a;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class IfTestAction extends ActionSupport {
    private String userName;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String execute() {
        if (userName != null && userName.length() > 0 
                && password != null 
                && password.length() > 0) {
            ServletActionContext.getContext().
                    getSession().put("loggedIn", true);
        }
        return SUCCESS;
    }
}
