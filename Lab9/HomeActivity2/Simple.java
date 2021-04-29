package lab9_homeactivity2;

public class Simple {

    private double  num1,num2;

    public Simple(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1+num2;
    }

    public double sub(){
        return num1-num2;
    }

    public double mul(){
        return num1*num2;
    }

    public double div(){
        return num1/num2;
    }
}