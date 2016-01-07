package app05a;

import java.util.SortedMap;
import java.util.TreeMap;

import com.opensymphony.xwork2.ActionSupport;

public class RadioTestAction extends ActionSupport {
    private int userType;
    private int incomeLevel;
    private static SortedMap<Integer, String> incomeLevels;
    static {
        incomeLevels = new TreeMap<Integer, String>();
        incomeLevels.put(1, "0 - $10,000");
        incomeLevels.put(2, "$10,001 - $30,000");
        incomeLevels.put(3, "$30,001 - $50,000");
        incomeLevels.put(4, "Over $50,000");
    }
    public int getIncomeLevel() {
        return incomeLevel;
    }
    public void setIncomeLevel(int incomeLevel) {
        this.incomeLevel = incomeLevel;
    }
    public int getUserType() {
        return userType;
    }
    public void setUserType(int userType) {
        this.userType = userType;
    }
    
    public SortedMap<Integer, String> getIncomeLevels() {
        return incomeLevels;
    }
}

