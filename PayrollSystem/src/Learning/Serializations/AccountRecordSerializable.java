/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning.Serializations;

import java.io.Serializable;

/**
 *
 * @author Marcelo
 */
public class AccountRecordSerializable implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    public AccountRecordSerializable(){
        this(0, "", "", 0.0);
    }

    public AccountRecordSerializable(int account, String firstName, String lastName, double balance) {
        setAccount(account);
        setFirstName(firstName);
        setLastName(lastName);
        setBalance(balance);
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }
    
    
    
    
}
