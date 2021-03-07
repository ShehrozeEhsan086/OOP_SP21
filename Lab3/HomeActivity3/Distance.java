package lab3_homeactivity3;

public class Distance {
    
    public double feet;
    public double inches;
    
    public Distance(){
        feet = 1;
        inches = 1;
    }
    
    public Distance(double feet_ , double inches_){
        feet = feet_;
        inches = inches_;
    }
    
    public void displayDistance(){
        System.out.println("Distance: "+feet+" feets and "+inches+" inches");
    }
}
