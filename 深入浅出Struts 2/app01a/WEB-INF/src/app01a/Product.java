package app01a;

import java.io.Serializable;

public class Product implements Serializable {
    private String productName;

    private String description;

    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String save() {

        // add here code to save the product to the database

        return "success";
    }
}
