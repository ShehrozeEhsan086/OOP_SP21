package lab11_homeactivity3;

public class ConflictingInterfaceTest implements Interface1,Interface2{
    public void show(){
        System.out.println("Interest rate for this year is: "+Interface1.interestRate+"%");
        System.out.println("Interest rate for next year will be: "+Interface2.interestRate+"%");
        //Here we can differentiate the variables by the dot operator.
        // Although A single implementation of the method is enough for both interfaces.
    }
}