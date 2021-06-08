package lab12_assignment;

public class Lab12_Assignment_Runner {
    public static void main(String[] args) {
        //RUNNER FOR ASSOCIATION ARRAY.
        /*
        HumanResource HR = new HumanResource();
        HR.addEntity("Sir Ali", 123, "Teacher");
        HR.addEntity("Maam Rabia", 1235, "Teacher");
        HR.addEntity("Saqib", 6969, "Student");
        HR.addEntity("Tahir", 3241, "Student");
        HR.addEntity("Shehroze", 34562, "Student");
        HR.addEntity("Osama", 3901, "Student");

        HR.delete("Maam Rabia");
        HR.delete("Saqib");
        HR.delete("Shehroze");
//        HR.delete("Osama");
//        HR.delete("Sir Ali");
//        HR.delete("Tahir");


        System.out.println("Record: ");
        System.out.println(HR);
         */

        //RUNNER FOR ARRAYLIST.
        HumanResource HR = new HumanResource();
        HR.add(new Teacher("Sir Ali",123));
        HR.add(new Teacher("Maam Rabia", 1235));
        HR.add(new Student("Saqib", 6969));
        HR.add(new Student("Tahir", 3241));
        HR.add(new Student("Shehroze", 34562));
        HR.add(new Student("Osama",3901));


        HR.delete("Maam Rabia");
        HR.delete("Saqib");
        HR.delete("Shehroze");
//        HR.delete("Osama");
//        HR.delete("Sir Ali");
//        HR.delete("Tahir");

        System.out.println("Record: ");
        System.out.println(HR);
    }
}