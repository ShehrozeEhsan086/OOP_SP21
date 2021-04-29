package lab9_homeactivity3;

abstract class ShapeData {

    private int numberOfLines;
    private String penColor;
    private boolean fillColor;

    public ShapeData(int numberOfLines, String penColor, boolean fillColor){
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    abstract void draw();

}