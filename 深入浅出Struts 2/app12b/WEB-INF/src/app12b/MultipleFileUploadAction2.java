package app12b;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MultipleFileUploadAction2 
        extends ActionSupport {

    private List<File> attachment = 
            new ArrayList<File>();
    private List<String> attachmentFileName = 
            new ArrayList<String>();
    private List<String> attachmentContentType = 
            new ArrayList<String>();

    public List<File> getAttachment() {
        return attachment;
    }
    public void setAttachment(List<File> attachment) {
        this.attachment = attachment;
    }
    public List<String> getAttachmentFileName() {
        return attachmentFileName;
    }
    public void setAttachmentFileName(List<String> 
            attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }
    public List<String> getAttachmentContentType() {
        return attachmentContentType;
    }
    public void setAttachmentContentType(List<String> 
            attachmentContentType) {
        this.attachmentContentType = attachmentContentType;
    }
    public String upload() throws Exception {
        for (String fileName : attachmentFileName) {
            System.out.println(fileName);
        }
        return SUCCESS;
    }
}