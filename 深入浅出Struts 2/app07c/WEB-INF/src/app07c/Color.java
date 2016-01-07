package app07c;
import com.opensymphony.xwork2.ActionSupport;

public class Color extends ActionSupport {
    private int red;
    private int green;
    private int blue;
    public int getBlue() {
        return blue;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }
    public int getGreen() {
        return green;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public int getRed() {
        return red;
    }
    public void setRed(int red) {
        this.red = red;
    }
    public String getHexCode() {
        return (red < 16? "0" : "") 
                + Integer.toHexString(red)
                + (green < 16? "0" : "")
                + Integer.toHexString(green) 
                + (blue < 16? "0" : "")
                + Integer.toHexString(blue);
    }
}
