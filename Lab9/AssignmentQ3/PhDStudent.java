package lab9_assignment_q3;

class PhDStudent extends Student{

    public PhDStudent(String name,String program, int rollNumber){
        super(name,program,rollNumber);
    }

    public void takeExam(){
        System.out.println("Give Final Defence Presentation.");
    }
}