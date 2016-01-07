package app08a;
import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;

public class DateTestAction extends ActionSupport {
    private Date birthDate;
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
