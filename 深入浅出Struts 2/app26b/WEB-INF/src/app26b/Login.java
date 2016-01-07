package app26b;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
    private String userName;
    private String password;
    
    public String execute() {
        System.out.println("Help I'm being executed...");
        if (userName != null && password != null &&
                userName.equals("don") && password.equals("secret")) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

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
}
