package app04a;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction  {
    private int[] colors;
    public int[] getColors() {
        return colors;
    }
    public void setColors(int[] colors) {
        this.colors = colors;
    }
    public String getText() {
        return "OKay";
    }
    public String execute() {
        return "success";
    }
}

