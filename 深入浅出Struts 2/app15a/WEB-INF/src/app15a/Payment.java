package app15a;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Payment extends ActionSupport {
    private double amount;
    private int creditCardType;
    private String nameOnCard;
    private String number;
    private String expiryDate;
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCreditCardType() {
        return creditCardType;
    }
    public void setCreditCardType(int creditCardType) {
        this.creditCardType = creditCardType;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getNameOnCard() {
        return nameOnCard;
    }
    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String execute() {
        System.out.println("------------------------EXECUTE");
        // simulate a long processing task
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        return SUCCESS;
    }
}
