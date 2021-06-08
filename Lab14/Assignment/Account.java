package lab14_assignment;

import java.io.*;

public class Account implements Serializable {
    private int accountNumber;
    private double balance;

    public Account(){}

    public Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(balance-amount<0){
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
        }
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void transfer(double amount,Account recipientAccount){
        if(balance-amount<=0){
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
            recipientAccount.balance = recipientAccount.balance + amount;
            System.out.println("Money successfully transferred from account number "+accountNumber+" to account number "+recipientAccount.accountNumber);
        }
    }

    public double balanceInquiry(){
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}