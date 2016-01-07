package app04a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;


public class Test2Action  {
    public String datePattern = "mm/dd/yyyy";
    private String greeting = "Hello";
    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    public String execute() {
        ServletActionContext.getServletContext().
                setAttribute("code", "101");
        return "success";
    }
    
    public String repeat(int count, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
    public static Date now() {
        return new Date();
    }
    public String getTime() {
        return new Date().toString();
    }
    
    public List<String> getCountries() {
        List<String> countries = new ArrayList<String>();
        countries.add("Australia");
        countries.add("Fiji");
        countries.add("New Zealand");
        countries.add("Vanuatu");
        return countries;
    }
    public String[] getColors() {
        String[] colors = {"blue", "green", "red"};
        return colors;
    }
    
    public Map<String, String> getCities() {
        Map<String, String> cities = new HashMap<String, String>();
        cities.put("CA", "Sacramento");
        cities.put("WA", "Olympia");
        cities.put("UT", "Salt Lake City");
        return cities;
    }

}

