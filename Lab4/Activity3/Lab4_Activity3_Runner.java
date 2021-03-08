package lab4_;

public class Lab4_Activity3_Runner {
    public static void main (String[] args){
        
    Point p1 = new Point();
    p1.setX(10);
    p1.setY(7);
    p1.display();
    Point p2 = new Point(10,11);
    p2.movePoint(2,3);
    p2.display();
}
}
