package app26a;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import com.opensymphony.xwork2.ActionSupport;

@Results({
    @Result(name="success", value="/jsp/Customer.jsp", 
            type=ServletDispatcherResult.class),
    @Result(name="error", value="/jsp/Error.jsp", 
            type=ServletDispatcherResult.class)
})

public class Supplier extends ActionSupport {
    private String name;
    public String execute() {
        System.out.println("Help I'm being executed...");
        if (name == null || name.length() < 4) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
