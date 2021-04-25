package lab9_homeactivity2;

public class Lab9_HomeActivity2_Runner {
    public static void main(String[] args) {

        VerifiedSimple testRunOne = new VerifiedSimple(5,3);
        System.out.println("Addition: "+testRunOne.add());

        VerifiedSimple testRunTwo = new VerifiedSimple(-1,-4);
        System.out.println("Multiplication: "+testRunTwo.mul());
    }
}