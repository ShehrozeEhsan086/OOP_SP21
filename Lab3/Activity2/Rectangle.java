package l3a2runner;


public class Rectangle {
    public int length, width;
    public Rectangle(){
        length = 5; width = 2;
    }
    public Rectangle(int l, int w){
    length = l; width = w;
    }
    public int calculateArea (){
    return (length*width);
    } 
}
