package app12a;

import java.io.File;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

public class SingleFileUploadAction extends ActionSupport implements
        ServletContextAware {

    private File attachment;
    private String attachmentFileName;
    private String attachmentContentType;
    private String description;
    private ServletContext servletContext;

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public File getAttachment() {
        return attachment;
    }

    public void setAttachment(File attachment) {
        this.attachment = attachment;
    }

    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    public void setAttachmentFileName(String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

    public String getAttachmentContentType() {
        return attachmentContentType;
    }

    public void setAttachmentContentType(String attachmentContentType) {
        this.attachmentContentType = attachmentContentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String upload() throws Exception {
        if (attachment != null) {
            // attachment will be null if there's an error,
            // such as if the uploaded file is too large
            String dataDir = servletContext.getRealPath("/WEB-INF/data");
            File savedFile = new File(dataDir, attachmentFileName);
            attachment.renameTo(savedFile);
            return SUCCESS;
        } else {
            return INPUT;
        }
        
    }
}
