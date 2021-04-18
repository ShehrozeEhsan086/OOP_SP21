package lab8_homeactivity1;

import java.util.Date;

public class Staff extends Employee{

    private String title;

    public Staff(){
        title = "unknown";
    }

    public Staff(String name, String address, int phoneNumber, String email, String office, int salary, Date dateHired,String title){
        super(name,address,phoneNumber,email,office,salary,dateHired);
        this.title = title;
    }

    public void display(){
        super.display();
        System.out.println("Title: "+title);
    }
}