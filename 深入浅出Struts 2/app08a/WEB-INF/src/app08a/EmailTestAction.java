package app08a;

import com.opensymphony.xwork2.ActionSupport;

public class EmailTestAction extends ActionSupport {
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
