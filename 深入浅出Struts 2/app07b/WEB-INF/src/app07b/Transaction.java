package app07b;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Transaction extends ActionSupport {
    private String accountId;
    private Date transactionDate;
    private double amount;
    private int transactionType;
    private String datePattern = "yyyy-mm-dd";
    
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        System.out.println("setAmount");
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        System.out.println("setTransactionDate");
        this.transactionDate = transactionDate;
    }
    public int getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }
    public String getDatePattern() {
        return datePattern;
    }
    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
