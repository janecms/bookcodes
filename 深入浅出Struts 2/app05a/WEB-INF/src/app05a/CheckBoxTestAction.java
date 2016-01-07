package app05a;

import com.opensymphony.xwork2.ActionSupport;

public class CheckBoxTestAction extends ActionSupport {
    private boolean daily;
    private boolean weekly;
    private boolean monthly;
    public boolean isDaily() {
        return daily;
    }
    public void setDaily(boolean daily) {
        this.daily = daily;
    }
    public boolean isMonthly() {
        return monthly;
    }
    public void setMonthly(boolean monthly) {
        this.monthly = monthly;
    }
    public boolean isWeekly() {
        return weekly;
    }
    public void setWeekly(boolean weekly) {
        this.weekly = weekly;
    }
}

