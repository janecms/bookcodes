package app06a;
import org.apache.struts2.util.SubsetIteratorFilter;
import com.opensymphony.xwork2.ActionSupport;

public class SubsetTestAction extends ActionSupport {
    public SubsetIteratorFilter.Decider getMyDecider() {
        return new SubsetIteratorFilter.Decider() {
            public boolean decide(Object o1) {
                return o1.toString().length() > 4;
            }
        };
    }
}
