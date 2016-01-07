package app14b;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StreamResult;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;

public class GetImageAction extends ActionSupport implements
        ServletResponseAware, ServletContextAware {

    private String productId;
    private HttpServletResponse servletResponse;
    private ServletContext servletContext;
    public void setServletResponse(HttpServletResponse servletResponse) {
        this.servletResponse = servletResponse;
    }
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
    public InputStream getInputStream() throws Exception {
        String contentType = "image/gif";
        String imageDirectory = servletContext.getRealPath("images");
        // The images can be a jpg or gif, 
        // retrieve default image if no file was found
        File file = new File(imageDirectory, productId + ".gif");
        if (!file.exists()) {
            file = new File(imageDirectory, productId + ".jpg");
            contentType = "image/jpeg";
        }
        if (!file.exists()) {
            file = new File(imageDirectory, "noimage.jpg");
        }
        if (file.exists()) {
            Result result = ActionContext.getContext().
                    getActionInvocation().getResult();
            if (result != null && result instanceof StreamResult) {
                StreamResult streamResult = (StreamResult) result;
                streamResult.setContentType(contentType);
            }
            try {
                return new FileInputStream(file);
            } catch (IOException ex) {
            }
        } 
        return null;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
