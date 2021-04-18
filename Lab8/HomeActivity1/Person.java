package lab8_homeactivity1;

public class Person {

    private String name;
    private String address;
    private int phoneNumber;
    private String email;

    public Person(){
        name = "unknown";
        address = "unknown";
        phoneNumber = 0;
        email = "unknown";
    }

    public Person(String name,String address,int phoneNumber,String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void display(){
        System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNumber+"\nEmail: "+email);
    }
}