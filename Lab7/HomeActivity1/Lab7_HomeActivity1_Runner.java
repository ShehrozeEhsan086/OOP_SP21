package lab7_homeactivity1;

public class Lab7_HomeActivity1_Runner {
    public static void main(String[] args) {
        
        //One way to setup person address
        Address addressOne = new Address(1,2,"Rawalpindi","0002");
        Person residentOne = new Person(addressOne);

        //Another way to setup person address
        Person residentTwo = new Person(2,3,"Islamabad","0001");

        //Third way to setup person address
        Person residentThree = new Person();
        residentThree.setStreetNumber(1);
        residentThree.setHouseNumber(2);
        residentThree.setCity("Karachi");
        residentThree.setCode("0009");

        System.out.println("Resident's Data: ");
        System.out.println();
        residentOne.display();
        System.out.println();
        residentTwo.display();
        System.out.println();
        residentThree.display();
    }
}
