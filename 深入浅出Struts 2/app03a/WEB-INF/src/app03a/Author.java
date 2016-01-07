package app03a;

import com.opensymphony.xwork2.ActionSupport;

public class Author extends ActionSupport {
    private String firstName;
    private String lastName;
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
    
    public String add() {
        System.out.println("Author.add");
        return SUCCESS;
    }
    
    public String edit() {
        System.out.println("Author.edit");
        return SUCCESS;
    }
    public String delete() {
        System.out.println("Author.delete");
        return SUCCESS;
    }
    
}
