package app05a;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class OptGroupTestAction extends ActionSupport {
    private int city;
    private static Map<Integer, String> usCities = 
            new HashMap<Integer, String>();
    private static Map<Integer, String> canadaCities =
            new HashMap<Integer, String>();
    private static Map<Integer, String> mexicoCities =
            new HashMap<Integer, String>();
    static {
        usCities.put(1, "Atlanta");
        usCities.put(2, "Chicago");
        usCities.put(3, "Detroit");
        canadaCities.put(4, "Vancouver");
        canadaCities.put(5, "Toronto");
        canadaCities.put(6, "Montreal");
        mexicoCities.put(7, "Mexico City");
        mexicoCities.put(8, "Tijuana");
    }
    public int getCity() {
        return city;
    }
    public void setCity(int city) {
        this.city = city;
    }
    public Map<Integer, String> getUsCities() {
        return usCities;
    }
    public Map<Integer, String> getCanadaCities() {
        return canadaCities;
    }
    public Map<Integer, String> getMexicoCities() {
        return mexicoCities;
    }
    
}

