package lab2_homeactivity2;

import java.util.Scanner;

public class Lab2_HomeActivity2 {

    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Time currentTime = new Time();
        System.out.print("Enter Hours: ");
        currentTime.hours = userInput.nextInt();
        System.out.print("Enter Minutes: ");
        currentTime.minutes = userInput.nextInt();
        System.out.print("Enter Seconds: ");
        currentTime.seconds = userInput.nextInt();
        
        currentTime.DisplayTime();
    }
    
}
