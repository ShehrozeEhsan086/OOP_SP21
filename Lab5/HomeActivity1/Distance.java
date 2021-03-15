package lab5_homeactivity1;

public class Distance {
    private double feet;
    private double inches;

    public Distance(){
        feet = 0;
        inches = 0;
    }

    public Distance(double userEnteredFeet, double userEnteredInches){
        feet = userEnteredFeet;
        inches = userEnteredInches;
    }

    public void setFeet(double feet_){
        feet = feet_;
    }

    public void setInches(double inches_){
        inches = inches_;
    }

    public void Display(){
        System.out.println("Feet: "+feet+" inches: "+inches);
    }

    public Distance Add(Distance a){
        Distance addedDistance = new Distance(feet+a.feet,inches+a.inches);
        return addedDistance;
    }
}
