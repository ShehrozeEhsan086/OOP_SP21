package lab3_assignment2;

public class Time {
    public int hour;
    public int minute;
    public int second;
    
    public Time(){
        hour = 24;
        minute = 60;
        second = 60;
    }
    
    public Time(int hr, int min, int sec){
        if( hr >= 0 && hr <= 24){
            hour = hr;
        }
        else{
            System.out.println("Invalid value. Value must be between 0-24.");
        }
        
        if( min >= 0 && min <= 60){
            minute = min;
        }
        else{
            System.out.println("Invalid value. Value must be between 0-60");
        }
        
        if( sec >= 0 && sec <= 60){
            second = sec;
        }
        else{
            System.out.println("Invalid value. Value must be between 0-60");
        }
        
    }
    
    public void displayTime(){
        System.out.println("The current time is: " + hour + ":" + minute + ":"+ second);
    }
}
