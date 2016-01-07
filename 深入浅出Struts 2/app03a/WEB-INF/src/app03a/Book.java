package app03a;

import com.opensymphony.xwork2.ActionSupport;

public class Book extends ActionSupport {
    private String isbn;
    private String title;
    private String author;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String execute() {
        System.out.println("Book.execute");
        return SUCCESS;
    }
    public String add() {
        System.out.println("Book.add");
        return SUCCESS;
    }
    public String edit() {
        System.out.println("Book.edit");
        return SUCCESS;
    }
    public String delete() {
        System.out.println("Book.delete");
        return SUCCESS;
    }


}
