package app27a;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class AutoCompleterSupport extends ActionSupport {
	private static List<String> carMakes 
			= new ArrayList<String>();
	private String carMakeKey;
	static {
		carMakes.add("Acura");
		carMakes.add("Audi");
		carMakes.add("BMW");
		carMakes.add("Chrysler");
		carMakes.add("Ford");
		carMakes.add("GM");
		carMakes.add("Honda");
		carMakes.add("Hyundai");
		carMakes.add("Infiniti");
		carMakes.add("Kia");
		carMakes.add("Lexus");
		carMakes.add("Toyota");
	}
	public List<String> getCarMakes() {
		return carMakes;
	}
	public String getCarMakeKey() {
		return carMakeKey;
	}
	public void setCarMakeKey(String carMakeKey) {
		this.carMakeKey = carMakeKey;
	}
}
