package lab9_assignment_q1;

public class Clock {
    
    private int hr,min,sec;

    public Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getHr() {
        return hr;
    }

    public void DisplayTime(){
        System.out.print(hr+":"+min+":"+sec);
    }
}