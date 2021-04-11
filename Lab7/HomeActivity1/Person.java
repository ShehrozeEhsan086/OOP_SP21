package lab7_homeactivity1;

public class Person {

    private Address address;

    public Person(int streetNumber,int houseNumber,String city,String code){
        address = new Address(streetNumber,houseNumber,city,code);
    }

    public Person(Address userAddress){
        address = userAddress;
    }

    public Person(){
        address = new Address();
    }

    public void display(){
        System.out.println("Street Number: "+address.getStreetNumber());
        System.out.println("House Number: "+address.getHouseNumber());
        System.out.println("City: "+address.getCity());
        System.out.println("Code: "+address.getCode());
    }

    public void setStreetNumber(int streetNumber){
        address.setStreetNumber(streetNumber);
    }

    public void setHouseNumber(int houseNumber){
        address.setHouseNumber(houseNumber);
    }

    public void setCity(String city){
        address.setCity(city);
    }

    public void setCode(String code){
        address.setCode(code);
    }

    public void getStreetNumber(){
        address.getStreetNumber();
    }

    public void getHouseNumber(){
        address.getHouseNumber();
    }

    public void getCity(){
        address.getCity();
    }

    public void getCode(){
        address.getCode();
    }
}
