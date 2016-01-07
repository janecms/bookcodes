package app12b;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MultipleFileUploadAction extends ActionSupport {

    private File[] attachment;
    private String[] attachmentFileName;
    private String[] attachmentContentType;

    public File[] getAttachment() {
        return attachment;
    }

    public void setAttachment(File[] attachment) {
        this.attachment = attachment;
    }

    public String[] getAttachmentFileName() {
        return attachmentFileName;
    }

    public void setAttachmentFileName(String[] attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

    public String[] getAttachmentContentType() {
        return attachmentContentType;
    }

    public void setAttachmentContentType(String[] attachmentContentType) {
        this.attachmentContentType = attachmentContentType;
    }

    public String upload() throws Exception {
        ServletContext servletContext = ServletActionContext.getServletContext();
        String dataDir = servletContext.getRealPath("/WEB-INF");
        for (int i=0; i < attachment.length; i++) {
            File savedFile = new File(dataDir, attachmentFileName[i]);
            attachment[i].renameTo(savedFile); 
        }
        return SUCCESS;
    }
}
