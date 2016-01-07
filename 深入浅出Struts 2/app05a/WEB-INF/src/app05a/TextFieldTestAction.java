package app05a;
import com.opensymphony.xwork2.ActionSupport;

public class TextFieldTestAction extends ActionSupport {
    private String userName;
    private String password;
    private String code;

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
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
}
