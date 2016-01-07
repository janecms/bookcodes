package app19a;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.brainysoftware.captcha.CaptchaUtil;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport 
        implements ServletRequestAware {
    private String userName;
    private String password;
    private String word;
    private String hashCookieName = "hash";
    private HttpServletRequest httpServletRequest;
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
    public String getHashCookieName() {
        return hashCookieName;
    }
    public void setHashCookieName(String hashCookieName) {
        this.hashCookieName = hashCookieName;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }
    public String execute() {
        Cookie[] cookies = httpServletRequest.getCookies();
        String hash = null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(hashCookieName)) {
                hash = cookie.getValue();
                break;
            }
        }
        if (hash != null 
                && userName.equals("don") 
                && password.equals("secret")
                && CaptchaUtil.validate(word, hash)) {
            return SUCCESS;
        } else {
            addActionError("Login failed.");
            return INPUT;
        }
    }
}
