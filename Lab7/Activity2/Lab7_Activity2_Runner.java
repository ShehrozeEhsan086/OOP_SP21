package lab7_activity2;

public class Lab7_Activity2_Runner {
    public static void main(String[] args){
        Date b = new Date (1,12,1990);
        Date h = new Date (5,6,2016);
        employee e1 =   new employee("xxx", "yyyy",b,h);
        e1.display();
    }
}