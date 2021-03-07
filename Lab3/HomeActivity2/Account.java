package lab3_homeactivity2;


public class Account {
    public int accountBalance;
    
    public Account(){
        accountBalance = 5000; 
    }
    
    public Account(int balance){
        accountBalance = balance;
    }
    
    public void deposit(int depositAmount){
        accountBalance = accountBalance + depositAmount;
        System.out.println("Your new balance is Rs."+accountBalance);
    }
    
    public void withdraw(int withdrawAmount){
        accountBalance = accountBalance + withdrawAmount;
        System.out.println("Your new balance is Rs."+accountBalance);
    }
}

