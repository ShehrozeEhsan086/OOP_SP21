package lab12_assignment;

import java.util.Scanner;

public class Student extends Person implements Association{

    private int rollNumber;
    private int semester;

    public Student(String name, int idCardNumber){
        super(name,idCardNumber);
    }

    @Override
    public void associate() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Roll Number of "+getName()+": ");
        rollNumber = userInput.nextInt();
        System.out.print("Enter Semester of "+getName()+": ");
        semester = userInput.nextInt();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString()+", Roll Number: "+rollNumber+", Semester: "+semester;
    }
}