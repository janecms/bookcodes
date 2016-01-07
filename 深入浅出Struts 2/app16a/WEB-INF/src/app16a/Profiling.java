package app16a;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class Profiling extends ActionSupport {
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
    
    public String execute() {
        System.out.println("xxxx");
        //UtilTimerStack.setActive(true);
        //System.setProperty(UtilTimerStack.ACTIVATE_PROPERTY, "true");
        String activityName = "database access";
        UtilTimerStack.push(activityName);
        try {
          // do some code
        } finally {
          UtilTimerStack.pop(activityName); //this needs to be the same text as above
        }
        
        return SUCCESS;
    }
}
