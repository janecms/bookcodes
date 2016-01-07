package app08a;

import com.opensymphony.xwork2.ActionSupport;

public class FieldExpressionTestAction extends ActionSupport {
    private int min;
    private int max;
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
}
