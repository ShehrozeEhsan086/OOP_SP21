package lab6_homeactivity2;

public class Lab6_HomeActivity2_Runner {
    public static void main(String[] args) {
        Object object1 = new Object(21);
        Object object2 = new Object();
        Object object3 = new Object(22);
        Object object4 = new Object();

        System.out.println("Initial Number of Objects: "+Object.numberOfObjects);
        Object.destroy(object1);
        Object.destroy(object3);

        System.out.println("Final Number of Objects: "+Object.numberOfObjects);

    }
}
