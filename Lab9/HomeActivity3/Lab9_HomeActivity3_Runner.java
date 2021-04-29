package lab9_homeactivity3;

public class Lab9_HomeActivity3_Runner {
    public static void main(String[] args) {

        Circle circle = new Circle(1,"Black",true);
        circle.draw();

        Square square = new Square(4,"Red",true);
        square.draw();

        Triangle triangle = new Triangle(3,"Purple",true);
        triangle.draw();

    }
}