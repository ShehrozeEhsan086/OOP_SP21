package lab8_assignment_q1;

import java.util.Scanner;

public class Lab8_Assignment_Q1_Runner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to SHEHROZE PUBLICATIONS.");
        System.out.println("Enter Data for Book.");
        System.out.print("Enter Name of book: ");
        String bookName = userInput.next();
        System.out.print("Enter Price of book: ");
        int bookPrice = userInput.nextInt();
        System.out.print("Enter Page Count: ");
        int bookPageCount = userInput.nextInt();
        Book book = new Book(bookName,bookPrice,bookPageCount);

        System.out.println();
        System.out.println("Enter Data for Audio-Cassette. ");
        System.out.print("Enter Name of Audio-Book: ");
        String tapeName = userInput.next();
        System.out.print("Enter Price of Audio-Book: ");
        int tapePrice = userInput.nextInt();
        System.out.print("Enter Page Count: ");
        int playTime = userInput.nextInt();
        Tape audioBook = new Tape(tapeName,tapePrice,playTime);

        System.out.println();
        System.out.println("BOOK:");
        book.display();
        System.out.println();
        System.out.println("AUDIO-BOOK:");
        audioBook.display();
    }
}
