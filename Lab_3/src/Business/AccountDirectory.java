/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class AccountDirectory {
    private ArrayList<Account> accountList;

    public AccountDirectory() {
        
        this.accountList = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount() {
        Account new_account = new Account();
        accountList.add(new_account);
        return new_account;
    }
    
    public boolean checkDuplication(String accountNumber, String routingNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber) || account.getRoutingNumber().equals(routingNumber))
                return true;
        }
        return false;
    }
    
    public void deleteAccount(Account account) {
        accountList.remove(account);
    }
    
    
    public Account searchAccount(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        }
        return null;
    }
}
