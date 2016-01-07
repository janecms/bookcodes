package app17a;


import com.opensymphony.xwork2.ActionSupport;

public class HeavyDuty extends ActionSupport {
    public String execute() {
        try {
            Thread.sleep(12000);
        } catch (Exception e) {
        }
        return SUCCESS;
    }
    private int complete = 0;
    public int getComplete() {
        complete += 10;
        return complete;
    }
    
}
