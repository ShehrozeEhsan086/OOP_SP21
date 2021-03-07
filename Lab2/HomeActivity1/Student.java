package lab2_homeactivity1;

public class Student {
    public String studentName;
    public int studentId;
    public int studentAge;
    public String studentGender;
    public String studentMajor;
    public String studentSection;
    
    public void DisplayStudentInfo(){
        System.out.println("Student Name is: " + studentName + "\nStudent Id is: "+ studentId +"\nStudent Age is: "+ studentAge + "\nStudent Majoring in: "+studentMajor+
        "\nStudent Section: "+ studentSection +"\nStudent Gender is: " + studentGender);
    }
}
