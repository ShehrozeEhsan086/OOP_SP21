package lab9_homeactivity3;

class Circle extends ShapeData{

    public Circle(int numberOfLines, String penColor, boolean fillColor){
        super(numberOfLines,penColor,fillColor);
    }

    public void draw(){
        System.out.println("Circle Draw.");
    }
}