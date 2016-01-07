package app05a;

import com.opensymphony.xwork2.ActionSupport;

public class DoubleSelectTestAction extends ActionSupport {
    private String country;
    private String city;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}

