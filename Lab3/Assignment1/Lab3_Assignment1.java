package lab3_assignment1;

public class Lab3_Assignment1 {

    public static void main(String[] args) {
        Marks m1 = new Marks();
        System.out.println(m1.calculateSum());
        
        Marks m2 = new Marks(50, 90, 80);
        System.out.println(m2.calculateSum());
    }
    
}
