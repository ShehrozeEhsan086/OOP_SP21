package lab3_homeactivity1;

public class Circle {
    public float radius;
    
    public Circle(){
        radius = 1;
    }
    
    public Circle(float r){
        radius = r;
    }
    
    public double displayCircumference(){
        return  (2 * Math.PI *  radius ) ;
    }
}
