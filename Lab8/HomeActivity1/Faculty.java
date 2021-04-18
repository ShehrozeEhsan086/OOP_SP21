package lab8_homeactivity1;

import java.util.Date;

public class Faculty extends Employee{

    private int officeHours;
    private String rank;

    public Faculty(){
        officeHours = 0;
        rank = "unknown";
    }

    public Faculty(String name,String address,int phoneNumber,String email,String office,int salary,Date dateHired,int officeHours,String rank){
        super(name,address,phoneNumber,email,office,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void display(){
        super.display();
        System.out.println("Office Hours: "+officeHours+"\nRank: "+rank);
    }
}