package lab8_homeactivity1;

import java.util.Date;

public class Lab8_HomeActivity1_Runner {
    public static void main(String[] args) {
        System.out.println("Student: ");
        Student studentOne = new Student("Tahir","Lahore",331331331,"Tahir@gmail.com","Good Academic Status");
        studentOne.display();
        System.out.println();

        System.out.println("Faculty: ");
        Date facultyOneHireDate = new Date(2020,2,1);
        Faculty facultyOne = new Faculty("Anjum","Karachi",323232323,"Anjum@yahoo.com","Dept. CS",100_000,facultyOneHireDate,7,"HOD");
        facultyOne.display();
        System.out.println();

        System.out.println("Staff: ");
        Date staffOneHireDate = new Date(2021,6,12);
        Staff staffOne = new Staff("Abdullah","Rawalpindi",39392393,"Abdullah@gmail.com","Security",80000,staffOneHireDate,"Chief Security Officer");
        staffOne.display();
        System.out.println();
    }
}
