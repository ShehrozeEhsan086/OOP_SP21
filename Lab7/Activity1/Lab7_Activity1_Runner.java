package lab7_activity1;

public class Lab7_Activity1_Runner {
    public static void main(String args[]){
        studentRecord s = new studentRecord("MBA");
        employeeRecord e = new employeeRecord(111, 50000);
        Manager m1 = new Manager("Finance Manager" , 5000, e, s ) ;
        m1.display(); 
    }
}
