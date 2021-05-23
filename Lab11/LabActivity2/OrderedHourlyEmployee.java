package lab11_labactivity2;

//This example show how to implement interface to a class

public class OrderedHourlyEmployee extends HourlyEmployee implements Ordered{
    
    public boolean precedes(Object other) {
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployee))
            return false;
        else{
            OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
            return (getPay() < otherOrderedHourlyEmployee.getPay());
        }
    }

    public boolean follows(Object other){
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployee))
            return false;
        else{
            OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
        return (otherOrderedHourlyEmployee.precedes( this));
        } 
    }
} 