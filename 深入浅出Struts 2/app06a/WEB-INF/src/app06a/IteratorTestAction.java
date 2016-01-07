package app06a;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class IteratorTestAction extends ActionSupport {
    private int[] interests;
    private static List<Interest> interestOptions = 
            new ArrayList<Interest>();
    static {
        interestOptions.add(new Interest(1, "Automotive"));
        interestOptions.add(new Interest(2, "Games"));
        interestOptions.add(new Interest(3, "Sports"));
    }
    public int[] getInterests() {
        return interests;
    }

    public void setInterests(int[] interests) {
        this.interests = interests;
    }
    public List<Interest> getInterestOptions() {
        return interestOptions;
    }
    
}

class Interest {
    private int id;
    private String description;
    public Interest(int id, String description) {
        this.id = id;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}

