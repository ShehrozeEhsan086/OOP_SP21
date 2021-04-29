package lab9_homeactivity3;

public class Square extends ShapeData{

    public Square(int numberOfLines, String penColor, boolean fillColor){
        super(numberOfLines,penColor,fillColor);
    }

    public void draw(){
        System.out.println("Square Draw.");
    }
}