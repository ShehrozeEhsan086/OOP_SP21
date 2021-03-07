package lab2_homeactivity1;


public class Lab2_HomeActivity1 {

    
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.studentName = "Ali";
        studentOne.studentId = 80;
        studentOne.studentGender = "Male";
        studentOne.studentAge = 20;
        studentOne.studentMajor = "Software Engineering";
        studentOne.studentSection = "3B";
        
        Student studentTwo = new Student();
        studentTwo.studentName = "Waleed";
        studentTwo.studentId = 76;
        studentTwo.studentGender = "Male";
        studentTwo.studentAge = 23;
        studentTwo.studentMajor = "Electrical Engineering";
        studentTwo.studentSection = "7A";
        
        
        studentOne.DisplayStudentInfo();
        System.out.println();
        studentTwo.DisplayStudentInfo();
    } 
}
