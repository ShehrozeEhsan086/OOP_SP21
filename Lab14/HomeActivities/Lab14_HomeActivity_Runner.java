package lab14_homeactivities;

import java.io.*;
import java.util.Scanner;

public class Lab14_HomeActivity_Runner {
        public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Book[] books = new Book[5];
        books[0] = new Book("Maths", "Dogar", "Dr Taha", 55);
        books[1] = new Book("Physics", "Dogar", "Dr AbuBakar", 47);
        books[2] = new Book("Chemistry", "Dogar", "Dr Chemist", 45);
        books[3] = new Book("Computer", "Dogar", "Dr Bill Gates", 62);
        books[4] = new Book("Stats", "Dogar", "Mr StatMan", 35);
        write(books);
        display(books);
        System.out.println();
        System.out.print("Enter Book Name to print details: ");
        String findBook = userInput.next();
        findBook(findBook);
    }

    public static void write(Book[] book) {
        ObjectOutputStream fileWriter = null;
        try {
            fileWriter = new ObjectOutputStream(new FileOutputStream("BookStore"));
            int i = 0;
            while (true) {
                if (i == 5) {
                    break;
                }
                fileWriter.writeObject(book[i]);
                i++;
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Writing to file complete.");
        System.out.println();
    }
    public static void display(Book[] book){
        System.out.println("Reading from file.");
        ObjectInputStream fileReader = null;
        try {
            fileReader = new ObjectInputStream(new FileInputStream("BookStore"));
            int i = 0;
            while (i<5) {
                Book bookRead = (Book) fileReader.readObject();
                System.out.println();
                System.out.println(bookRead);
                i++;
            }
        }catch (EOFException e){
            System.out.println("End of File.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void findBook(String name){
        ObjectInputStream fileReader = null;
        try{
            fileReader = new ObjectInputStream(new FileInputStream("BookStore"));
            while(true){
                Book bookRead = (Book) fileReader.readObject();
                if(bookRead.getName().equals(name)){
                    System.out.println(bookRead);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}