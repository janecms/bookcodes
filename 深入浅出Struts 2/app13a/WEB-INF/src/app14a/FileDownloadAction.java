package app14a;
import java.io.InputStream;
import javax.servlet.ServletContext;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport 
        implements ServletContextAware {
    private String filePath;
    private ServletContext servletContext;
    
    public void setServletContext(
            ServletContext servletContext) {
        this.servletContext = servletContext;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public InputStream getInputStream() throws Exception {
        return servletContext.getResourceAsStream(filePath);
    }
}
