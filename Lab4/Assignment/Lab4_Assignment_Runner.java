package lab4_assignment;

public class Lab4_Assignment_Runner {
    public static void main(String[] args) {

        HotDogStand standBlueAre = new HotDogStand(1,0);
        HotDogStand standF9 = new HotDogStand(2,5);
        HotDogStand standRawalChowk = new HotDogStand(3,0);

        System.out.println("Initial sales report: ");
        System.out.println("HotDogs sold at Blue Area = "+standBlueAre.getNumberOfHotDogSold());
        System.out.println("HotDogs sold at F9 = "+standF9.getNumberOfHotDogSold());
        System.out.println("HotDogs sold at Rawal Chowk = "+standRawalChowk.getNumberOfHotDogSold());

        System.out.println();

        System.out.println("Stand IDs: \nBlue Area = 1 \tF9 = 2\tRawal Chowk = 3");

        System.out.println();

        standF9.justSold();
        standBlueAre.justSold();
        standRawalChowk.justSold();
        standF9.justSold();
        standRawalChowk.justSold();

        System.out.println();

        System.out.println("End of day sales report: ");
        System.out.println("HotDogs sold at Blue Area = "+standBlueAre.getNumberOfHotDogSold());
        System.out.println("HotDogs sold at F9 = "+standF9.getNumberOfHotDogSold());
        System.out.println("HotDogs sold at Rawal Chowk = "+standRawalChowk.getNumberOfHotDogSold());

    }
}
