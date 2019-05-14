package constructorpack;

import javax.swing.*;
import java.util.Scanner;

public class BankAccount {
    //fields
    public String accountNumber;
    public double balance;
    public String customerName;
    public String email;

// ** whatever I want to do at the time of being created. We can call a constructor from another constructor, ex:
// if we have an empty construc. we can call a default construct.

    public BankAccount() { // constructor, initialize the obj that I created and do **

       this("56789", 2.50, "Default name", "Default email"); // this line call the next constructor
        System.out.println("Empty Constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email){
        System.out.println("Constructor with paramters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(String customerName, String email) {
        this("99999", 100.5, customerName, email);
    }

    //setters & getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//additional methods *****************

    public void toDepositFunds(double deposit1) {
        this.balance = balance + deposit1;
        System.out.println("Deposit of " + deposit1 + " made. New balance is " + this.balance);
    }

    public void toWithdrawFunds(double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Only " + balance + " available. withdrawal not processed");
        } else {
            this.balance = balance - withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed. Remaining balance = " + this.balance);
        }
    }
}
