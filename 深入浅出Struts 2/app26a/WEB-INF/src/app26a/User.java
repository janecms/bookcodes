package app26a;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletDispatcherResult;
import com.opensymphony.xwork2.ActionSupport;

@Result(name="success", value="/jsp/Customer.jsp", 
        type=ServletDispatcherResult.class)
@ParentPackage(value="struts-default")
public class User extends ActionSupport {

}
