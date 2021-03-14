package lab4_homeactivity2;

public class Account {
    
    private int balance;

    public Account(){
        balance = 0;
    }

    public Account(int userBalance){
        balance = userBalance;
    }

    public void withdraw(int withdrawAmount){
        balance = balance - withdrawAmount;
        System.out.println("Rs."+withdrawAmount+" withdrew from account remaining balance Rs."+balance);
    }

    public void deposit(int depositAmount){
        balance = balance + depositAmount;
        System.out.println("Rs."+depositAmount+" deposited to account new balance Rs."+balance);
    }

    public int getBalance(){
        return balance;
    }
}
