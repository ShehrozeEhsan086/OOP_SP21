package lab8_assignment_q2;

public class Computer {

    private int wordSize;
    private int memorySize;
    private int storageSize;
    private double speed;

    public Computer(){
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }

    public Computer(int wordSize,int memorySize,int storageSize,double speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Word Size: "+wordSize+" Bits\nMemory Size: "+memorySize+" Megabits\nStorage Size: "+storageSize+" Megabytes\nSpeed: "+speed+" MegaHertz");
    }
}