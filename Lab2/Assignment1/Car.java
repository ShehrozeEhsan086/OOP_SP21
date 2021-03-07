package lab2_assignment1;

public class Car {
    
    public String company;
    public String model;
    public String colour;
    public String dateOfManufacture;
    public String regNo;
    
    public void DisplayCarInfo(){
        System.out.println("This car is a "+company + " " + model+"\nColour: "+colour+ "\nBuilt on:  "+dateOfManufacture +"\nRegistration Number: "+regNo); 
    }
}
