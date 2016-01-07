package app03a;

import java.util.Collection;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Collection emails;
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Collection getEmails() {
        return emails;
    }
    public void setEmails(Collection emails) {
        this.emails = emails;
    }
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
    
    public String register() {
        
        // do something here
        return "success";
    }
    

}
