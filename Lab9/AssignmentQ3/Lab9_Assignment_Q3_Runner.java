package lab9_assignment_q3;

public class Lab9_Assignment_Q3_Runner {
    public static void main(String[] args) {

        PhDStudent studentOne = new PhDStudent("Ali","Foreign Relation",5);
        studentOne.display();
        studentOne.takeExam();

        GraduateStudent studentTwo = new GraduateStudent("Taha","Computer Science",77);
        studentTwo.display();
        studentTwo.takeExam();
    }
}