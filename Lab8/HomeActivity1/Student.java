package lab8_homeactivity1;

public class Student extends Person {

    private String status;

    public Student(){
        super();
        status = "unknown";
    }

    public Student(String name,String address,int phoneNumber,String email,String status){
        super(name,address,phoneNumber,email);
        this.status = status;
    }

    public void display(){
        super.display();
        System.out.println("Student Status: "+status);
    }
}