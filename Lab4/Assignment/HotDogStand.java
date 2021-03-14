package lab4_assignment;

public class HotDogStand {
    private int hotDogStandID;
    private int hotDogSold;

    public HotDogStand(int ID,int numberOfHotDogSold){
        hotDogStandID = ID;
        hotDogSold = numberOfHotDogSold;
    }

    public void justSold(){
        System.out.println("A HotDog was sold at stand "+hotDogStandID);
        hotDogSold++;
    }

    public int getNumberOfHotDogSold(){
        return hotDogSold;
    }
}
