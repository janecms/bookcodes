package app06a;
import java.util.Comparator;
import com.opensymphony.xwork2.ActionSupport;

public class SortTestAction extends ActionSupport {
    public Comparator getMyComparator() {
        return new Comparator() {
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        };
    }
}
