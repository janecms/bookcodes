package app07a;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Transaction extends ActionSupport {
    private String accountId;
    private Date transactionDate;
    private double amount;
    private int transactionType;
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
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public int getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }
}
