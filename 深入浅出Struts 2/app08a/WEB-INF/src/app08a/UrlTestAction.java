package app08a;
import com.opensymphony.xwork2.ActionSupport;

public class UrlTestAction extends ActionSupport {
    private String url;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
