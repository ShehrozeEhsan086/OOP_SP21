package lab7_activity1;

public class employeeRecord {
   
    private int emp_id;
    private double salary;

    public employeeRecord (int emp, int salary){
        emp_id = emp;
        this.salary = salary;
    }

    public void setEmp_id ( int id){
        emp_id = id;
    }

    public int getEmp_id (){
        return emp_id ;
    }

    public void setSalary ( double sal){
        salary = sal;
    }

    public double getSalary (){
        return salary;
    }
}
