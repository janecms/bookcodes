package app09c.resourcebundle;
import java.util.Calendar;
import java.util.ListResourceBundle;

public class MyCustomResourceBundle extends ListResourceBundle {
    public Object[][] getContents() {
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            return contents1;
        } else {
            return contents2;
        }
    }
    static final Object[][] contents1 = { 
            { "greetings", "Good morning {0}" },
            { "farewell", "Good bye" } };

    static final Object[][] contents2 = { 
            { "greetings", "Hello {0}" },
            { "farewell", "Good bye" } };
}
