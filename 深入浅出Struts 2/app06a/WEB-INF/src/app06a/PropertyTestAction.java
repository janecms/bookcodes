package app06a;

import com.opensymphony.xwork2.ActionSupport;
public class PropertyTestAction extends ActionSupport {
    private float temperature = 100.05F;
    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
