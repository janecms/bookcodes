package app26a.admin.action;

import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ActionSupport;

@Result(name="success", value="/jsp/Customer.jsp", 
        type=ServletDispatcherResult.class)
@Namespace(value="/")
public class EditCustomer extends ActionSupport {

}
