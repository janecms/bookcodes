package app05a;
import com.opensymphony.xwork2.ActionSupport;

public class UpDownSelectTestAction extends ActionSupport {
    private int[] colors;
    public int[] getColors() {
        return colors;
    }
    public void setColors(int[] colors) {
        this.colors = colors;
    }
}

