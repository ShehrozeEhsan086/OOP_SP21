package lab8_assignment_q1;

public class Tape extends Publication{

    private int playTime;

    public Tape(){
        playTime = 0;
    }

    public Tape(String title,int price,int playTime){
        super(title,price);
        this.playTime = playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void display(){
        super.display();
        System.out.println("Play Time: "+playTime);
    }
}