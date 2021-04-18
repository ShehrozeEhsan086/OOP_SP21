package lab8_assignment_q2;

import java.util.Scanner;

public class Lab8_Assignment_Q2_Runner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Name of Laptop: ");
        String laptopName = userInput.next();
        System.out.print("Enter Word Size in Bits: ");
        int wordSize = userInput.nextInt();
        System.out.print("Enter Memory Size in MegaBits: ");
        int memorySize = userInput.nextInt();
        System.out.print("Enter Storage Size in MegaBytes: ");
        int storageSize = userInput.nextInt();
        System.out.print("Enter Speed in MegaHertz: ");
        double speed = userInput.nextDouble();
        System.out.print("Enter Length in inch: ");
        double length = userInput.nextDouble();
        System.out.print("Enter Width in inch: ");
        double width = userInput.nextDouble();
        System.out.print("Enter Height in inch: ");
        double height = userInput.nextDouble();
        System.out.print("Enter Weight in Kg: ");
        double weight = userInput.nextDouble();

        Laptop laptop = new Laptop(wordSize,memorySize,storageSize,speed,length,width,height,weight);
        System.out.println();
        System.out.println("Laptop Details: ");
        System.out.println("Name: "+laptopName);
        laptop.display();

    }
}