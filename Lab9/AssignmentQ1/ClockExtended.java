package lab9_assignment_q1;

public class ClockExtended extends Clock{
    
    private String beforeAfterEvening;

    public ClockExtended(int hr, int min, int sec, String beforeAfterEvening){
        super(hr,min,sec);
        this.beforeAfterEvening = beforeAfterEvening;
    }

    @Override
    public void DisplayTime(){
        super.DisplayTime();
        System.out.print(" "+beforeAfterEvening+" in 12 hour clock.");
        convertTime();
        System.out.println();
        super.DisplayTime();
        System.out.println(" in 24 hour clock.");
    }

    private void convertTime(){
        if(beforeAfterEvening.equals("PM") || beforeAfterEvening.equals("pm")){
            int hour = getHr();
            hour = hour + 12;
            setHr(hour);
        }
    }
}