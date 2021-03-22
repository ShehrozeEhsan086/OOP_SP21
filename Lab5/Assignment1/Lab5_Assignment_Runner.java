package lab5_assignment;

public class Lab5_Assignment_Runner {
    public static void main(String[] args) {

        Fraction number = new Fraction();
        number.setNumberOne(3);
        number.setNumberTwo(5);
        System.out.print("Ration of two numbers using get method: "+number.getRation()+"\n");
        System.out.println("Ratio of two number using display method ");
        number.display();

        if (number.equal(0.7)){
            System.out.println("Both are equal.");
        } else
            System.out.println("Both are not equal.");

    }
}
