package lab7_homeactivity3;

public class Lab7_HomeActivity3_Runner {
    public static void main(String[] args) {

     Line lineOne = new Line("3,4","5,7");
     Line lineTwo = new Line("0,0","9,9");

     System.out.println("Distance of Line One: "+lineOne.findLength());
     System.out.println("Distance of Line Two: "+lineTwo.findLength());
    }
}