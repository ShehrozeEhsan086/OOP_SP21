package lab3_homeactivity2;


public class Lab3_HomeActivity2 {

   
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.withdraw(2000);
        a1.deposit(2500);
        Account a2 = new Account(100000);
        a2.withdraw(50000);
        a2.deposit(20000);
    }
    
}
