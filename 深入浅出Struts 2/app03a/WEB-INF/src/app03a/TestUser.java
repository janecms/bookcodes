package app03a;

import com.opensymphony.xwork2.ActionSupport;

public class TestUser extends ActionSupport {
    private String userName = "bu di";
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
        String s = "ab";
        Integer.parseInt(s);
        return SUCCESS;
    }
}
