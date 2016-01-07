package app07c.converter;
import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;
import app07c.Color;
import com.opensymphony.xwork2.util.TypeConversionException;

public class MyColorConverter extends StrutsTypeConverter {
    public Object convertFromString(Map context, String[] values,
            Class toClass) {
        boolean ok = false;
        String rgb = values[0];
        String[] colorComponents = rgb.split(",");
        if (colorComponents != null 
                && colorComponents.length == 3) {
            String red = colorComponents[0];
            String green = colorComponents[1];
            String blue = colorComponents[2];
            int redCode = 0;
            int greenCode = 0;
            int blueCode = 0;
            try {
                redCode = Integer.parseInt(red.trim());
                greenCode = Integer.parseInt(green.trim());
                blueCode = Integer.parseInt(blue.trim());
                if (redCode >= 0 && redCode < 256 
                        && greenCode >= 0 && greenCode < 256 
                        && blueCode >= 0 && blueCode < 256) {
                    Color color = new Color();
                    color.setRed(redCode);
                    color.setGreen(greenCode);
                    color.setBlue(blueCode);
                    ok = true;
                    return color;
                }
            } catch (NumberFormatException e) {
            }
        }
        if (!ok) {
            throw new 
                    TypeConversionException("Invalid color codes");
        }
        return null;
    }

    public String convertToString(Map context, Object o) {
        Color color = (Color) o;
        return color.getRed() + "," 
                + color.getGreen() + ","
                + color.getBlue();
    }
}
