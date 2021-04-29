package lab9_assignment_q1;

import java.util.Scanner;

public class Lab9_Assignment_Q1_Runner {
    public static void main(String[] args) {
        int hr,min,sec;
        String prePostEvening;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        hr = userInput.nextInt();
        System.out.print("Enter Minutes: ");
        min = userInput.nextInt();
        System.out.print("Enter Seconds: ");
        sec = userInput.nextInt();
        System.out.print("AM or PM: ");
        prePostEvening = userInput.next();

        ClockExtended time = new ClockExtended(hr,min,sec,prePostEvening);
        time.DisplayTime();
    }
}
