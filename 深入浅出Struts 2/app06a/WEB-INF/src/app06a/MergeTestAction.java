package app06a;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class MergeTestAction extends ActionSupport {
    private static List<String> americanCars;
    private static List<String> europeanCars;
    private static List<String> japaneseCars;
    static {
        americanCars = new ArrayList<String>();
        americanCars.add("Ford");
        americanCars.add("GMC");
        americanCars.add("Lincoln");
        europeanCars = new ArrayList<String>();
        europeanCars.add("Audi");
        europeanCars.add("BMW");
        europeanCars.add("VW");
        japaneseCars = new ArrayList<String>();
        japaneseCars.add("Honda");
        japaneseCars.add("Nissan");
        japaneseCars.add("Toyota");
    }
    public List<String> getAmericanCars() {
        return americanCars;
    }
    public List<String> getEuropeanCars() {
        return europeanCars;
    }
    public List<String> getJapaneseCars() {
        return japaneseCars;
    }
}
