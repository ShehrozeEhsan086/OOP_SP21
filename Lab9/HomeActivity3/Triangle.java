package lab9_homeactivity3;

public class Triangle extends ShapeData{

    public Triangle(int numberOfLines, String penColor, boolean fillColor){
        super(numberOfLines,penColor,fillColor);
    }

    public void draw(){
        System.out.println("Triangle Draw.");
    }
}