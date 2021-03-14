package lab4_homeactivity2;

public class Lab4_HomeActivity_Runner {
    public static void main(String[] args) {

        Account accountOne = new Account(5000);
        Account accountTwo = new Account(5000);

        accountOne.deposit(500);
        accountOne.withdraw(1000);
        System.out.println("Account Balance is Rs."+accountOne.getBalance());

        System.out.println();

        accountTwo.deposit(2000);
        accountTwo.withdraw(5000);
        System.out.println("Account Balance is Rs."+accountTwo.getBalance());
    }
}

