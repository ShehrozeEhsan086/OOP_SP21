package lab2_assignment2;

public class Rectangle {
    
    public int height;
    public int width;
    private int area;
    
    public void calculateArea(){
        area = height * width;
    }
    
    public void displayArea(){
        System.out.println("Area of rectangle is: "+area);
    }
    
}
