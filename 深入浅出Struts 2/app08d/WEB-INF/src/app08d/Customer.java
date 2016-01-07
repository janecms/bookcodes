package app08d;
import com.opensymphony.xwork2.ActionSupport;

public class Customer extends ActionSupport {
    private String firstName;
    private String lastName;
    private Address address;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
