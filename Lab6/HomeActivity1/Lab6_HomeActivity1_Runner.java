package lab6_homeactivity1;

public class Lab6_HomeActivity1_Runner {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        System.out.println("Setting annual interest rate at 3");
        saver1.modifyInterestRate(3);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Saving balance for saver1 with monthly interest added: "+saver1.getSavingBalance());
        System.out.println("New Saving balance for saver2 with monthly interest added: "+saver2.getSavingBalance());

        System.out.println();
        System.out.println("Setting annual interest rate at 4");
        saver2.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Saving balance for saver1 with monthly interest added: "+saver1.getSavingBalance());
        System.out.println("New Saving balance for saver2 with monthly interest added: "+saver2.getSavingBalance());

    }
}
