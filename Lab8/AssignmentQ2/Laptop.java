package lab8_assignment_q2;

public class Laptop extends Computer {

    private double length;
    private double width;
    private double height;
    private double weight;

    public Laptop(){
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
    }

    public Laptop(int wordSize,int memorySize,int storageSize,double speed,double length,double width,double height,double weight){
        super(wordSize,memorySize,storageSize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void display(){
        super.display();
        System.out.println("Length: "+length+" inch\nWidth: "+width+" inch\nHeight: "+height+" inch\nWeight: "+weight+" kg");
    }
}