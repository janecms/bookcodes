package app09c.resourcebundle;
import java.util.Calendar;
import java.util.ListResourceBundle;

public class MyCustomResourceBundle_de extends ListResourceBundle {
    public Object[][] getContents() {
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            return contents1;
        } else {
            return contents2;
        }
    }
    static final Object[][] contents1 = { 
            { "greetings", "Guten Morgen {0}" },
            { "farewell", "Tschüß" } };

    static final Object[][] contents2 = { 
            { "greetings", "Hallo {0}" },
            { "farewell", "Tschüß" } };
}
