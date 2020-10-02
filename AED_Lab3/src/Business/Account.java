/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author charmidalal
 */
public class Account {
    
    /* Initialize account variables*/
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    /* Set current date value automatically */
    public Account() {
        this.createdOn = new Date();
    }
    
    /* Create getter and setters of variables */
     /* Get & Set Routing Number */
    public String getRoutingNumber() {
        return routingNumber;
    }
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    
    /* Get & Set Bank Account Number */
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    /* Get & Set Bank Name */
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    /* Get & Set Bank Balance */
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    /* Get Created On date */
    public Date getCreatedOn() {
        return createdOn;
    }
    
    /* Create function to get bank name as a string */
    @Override
    public String toString(){
        return bankName;
    }
}
