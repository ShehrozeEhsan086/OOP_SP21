package lab6_homeactivity1;

public class SavingAccount {
    
    private static double annualInterestRate;
    private double savingBalance;

    public SavingAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }

    public void calculateMonthlyInterest(){
        double temporary;
        temporary = savingBalance * (annualInterestRate/12);
        savingBalance = savingBalance + temporary;
    }

    public void modifyInterestRate(double annualInterestRate_){
        annualInterestRate = annualInterestRate_;
    }

    public double getSavingBalance(){
        return savingBalance;
    }
}
