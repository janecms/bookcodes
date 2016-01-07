package app07c;
import com.opensymphony.xwork2.ActionSupport;

public class Design extends ActionSupport {
    private String designName;
    private Color color;
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getDesignName() {
        return designName;
    }
    public void setDesignName(String designName) {
        this.designName = designName;
    }
}
