package lab7_homeactivity2;

public class Address {

    private int streetNumber;
    private int houseNumber;
    private String city;
    private String code;

    public Address(int streetNumber,int houseNumber,String city,String code){
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.city = city;
        this.code = code;
    }

    public Address(){}

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }
}