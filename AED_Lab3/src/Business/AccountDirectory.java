/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/* Import ArrayList library*/
import java.util.ArrayList;

/**
 *
 * @author charmidalal
 */
public class AccountDirectory {
     /* Initialize Account List Array List */
    private ArrayList<Account> accountList;
    
    /* Create constructor and assign array list memory */
    public AccountDirectory() {
       this.accountList = new ArrayList<Account>();
    }
    
    /* Get & Set Account List */
    public ArrayList<Account> getAccountList() {
        return accountList;
    }
    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    /* Add new account in to array */
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account;  
    }
    
    /* Delete accoun t from array */
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    /* Search account in array */
    public Account searchAccount(String accountNumber){
        for(Account account: accountList)
        {
            if(account.getAccountNumber().equals(accountNumber))
            {
                return account;
            }
        }
        return null;
    }
    
}
