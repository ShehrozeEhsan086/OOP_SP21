package lab12_assignment;


public class Person{

    private String name;
    private int idCardNumber;

    public Person(String name, int idCardNumber){
        this.name = name;
        this.idCardNumber = idCardNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    @Override
    public String toString() {
        return "Name: "+name+", IdCard Number: "+idCardNumber;
    }
}