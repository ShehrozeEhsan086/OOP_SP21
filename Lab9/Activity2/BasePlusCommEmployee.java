package lab9_activity2;

public class BasePlusCommEmployee extends commissionEmployee {
    private double salary;
    
    BasePlusCommEmployee(){
        salary=48000;
    }

    BasePlusCommEmployee(String A,String E,String B, double C, double D, double S){
        super(A,E,B,C,D);
        salary=S;
    }

//overridden method
    @Override
    public double earnings(){
        return super.earnings()+salary;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Salary : "+salary);
    }
}
