package lab5_assignment;

public class Fraction {
    
    private int numberOne;
    private int numberTwo;

    Fraction(){
        numberOne = 1;
        numberTwo = 1;
    }

    public void setNumberOne(int numberOne){
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getRation(){
        return (double) numberOne / (double) numberTwo;
    }

    public boolean equal(double fractionNumber){
        double fractionNumberTwo = (double) numberOne / (double) numberTwo;
        if (fractionNumber == fractionNumberTwo)
            return true;
        else
            return false;
    }


    public void display(){
        double fractionNumber = (double) numberOne / (double) numberTwo;
        System.out.println("Fraction of numbers is: "+fractionNumber);
    }
}
