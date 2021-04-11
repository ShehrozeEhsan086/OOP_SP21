package lab7_homeactivity2;

public class Lab7_HomeActivity2_Runner {
    public static void main(String[] args) {

        Book MirzaGalib = new Book("Urdu","Doger Publishers",1,9,"Lakhnow","0096");
        MirzaGalib.display();

        //Modifying Address of author through book class.
        MirzaGalib.setStreetNumber(99);
        MirzaGalib.setHouseNumber(42);
        MirzaGalib.setCity("Karachi");
        MirzaGalib.setCode("9510");

        System.out.println();
        System.out.println("MODIFIED AUTHOR ADDRESS.");
        System.out.println();
        MirzaGalib.display();
    }
}
