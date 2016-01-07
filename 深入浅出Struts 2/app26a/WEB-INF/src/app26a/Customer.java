package app26a;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import com.opensymphony.xwork2.ActionSupport;

@Result(name="success", value="/jsp/Customer.jsp", 
        type=ServletDispatcherResult.class)
public class Customer extends ActionSupport {
    public String execute() {
        System.out.println("Help I'm being executed...");
        return SUCCESS;
    }
}
