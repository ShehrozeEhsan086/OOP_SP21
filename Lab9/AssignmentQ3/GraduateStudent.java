package lab9_assignment_q3;

class GraduateStudent extends Student{

    public GraduateStudent(String name,String program, int rollNumber){
        super(name,program,rollNumber);
    }

    public void takeExam(){
        System.out.println("Give Written Exam.");
    }
}