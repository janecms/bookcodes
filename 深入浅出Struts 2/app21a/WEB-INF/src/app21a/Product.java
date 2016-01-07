package app21a;

import com.opensymphony.xwork2.ActionSupport;

public class Product extends ActionSupport {
    private String productId;
    private String name;
    private String description;
    private double price;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String save() {
        return SUCCESS;
    }
    
}

