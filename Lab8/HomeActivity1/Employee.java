package lab8_homeactivity1;

import java.util.Date;

public class Employee extends Person {

    private String office;
    private int salary;
    private Date dateHired;

    public Employee(){
        office = "unknown";
        salary = 0;
        dateHired = null;
    }

    public Employee(String name,String address,int phoneNumber,String email,String office,int salary,Date dateHired){
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public void display(){
        super.display();
        System.out.println("Office: "+office+"\nSalary: Rs."+salary+"\nDate Hired: "+dateHired);
    }
}