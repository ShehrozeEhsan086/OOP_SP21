package lab14_homeactivities;

import java.io.Serializable;

public class Book implements Serializable {

    private String name;
    private String publisher;
    private Person author;

   public Book(String name,String publisher,String authorName,int authorAge){
       this.name = name;
       this.publisher = publisher;
       this.author = new Person(authorName,authorAge);
   }

    @Override
    public String toString() {
        return "Book Name: "+name+"\nPublisher: "+publisher+"\n"+author.toString();
    }

    public String getName() {
        return name;
    }
}