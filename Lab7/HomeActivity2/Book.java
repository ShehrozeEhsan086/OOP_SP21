package lab7_homeactivity2;

public class Book {

    private Person author;
    private String bookName;
    private String publisher;


    public Book(String bookName,String publisher,int streetNumber,int houseNumber,String city,String code){
        author = new Person(streetNumber,houseNumber,city,code);
        this.bookName = bookName;
        this.publisher = publisher;
    }

    public void setStreetNumber(int streetNumber){
        author.setStreetNumber(streetNumber);
    }

    public void setHouseNumber(int houseNumber){
        author.setHouseNumber(houseNumber);
    }

    public void setCity(String city){
        author.setCity(city);
    }

    public void setCode(String code){
        author.setCode(code);
    }

    public void display(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Publisher: "+publisher);
        author.display();
    }

}