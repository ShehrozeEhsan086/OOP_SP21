package lab9_homeactivity2;

public class VerifiedSimple extends Simple {

    private double  num1,num2;

    public VerifiedSimple(double num1, double num2){
        super(num1,num2);
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double add(){
        if(num1 > 0 && num2 > 0){
            return super.add();
        } else{
            System.out.println("ERROR: Value of numbers less than 0.");
            return 0;
        }
    }

    @Override
    public double sub(){
        if(num1 > 0 && num2> 0){
            return super.sub();
        } else{
            System.out.println("ERROR: Value of numbers less than 0.");
            return 0;
        }
    }

    @Override
    public double mul(){
        if(num1 > 0 && num2> 0){
            return super.mul();
        } else{
            System.out.println("ERROR: Value of numbers less than 0.");
            return 0;
        }
    }

    @Override
    public double div(){
        if(num1 > 0 && num2> 0){
            return super.div();
        } else{
            System.out.println("ERROR: Value of numbers less than 0.");
            return 0;
        }
    }
}