package app05a;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class CheckBoxTest2Action extends ActionSupport{
    public List<Magazine> getMagazineList() {
        List<Magazine> magazines = new ArrayList<Magazine>();
        magazines.add(new Magazine("034", "The Economist"));
        magazines.add(new Magazine("122", "Business Week"));
        magazines.add(new Magazine("434", "Fortune"));
        magazines.add(new Magazine("906", "Small Business"));
        return magazines;
    }
    
    public void setMagazines(String[] codes) {
        for (String code : codes) {
            System.out.println(code + " is selected");
        }
    }
}

class Magazine {
    private String code;
    private String name;
    public Magazine(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
}
