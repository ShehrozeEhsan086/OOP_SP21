package lab11_labactivity1;

public class EmployeeTask implements RegisterForExams{
    private String name;
    private String date;
    private int salary;
    

    public EmployeeTask(){
        name = null;
        date = null;
        salary = 0;
    }

    public EmployeeTask(String name,String date,int salary){
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    @Override
    public void register() {
    // TODO Auto-generated method stub
        System.out.println("Name " + name + "\nsalary " + salary + "\nEmployee registered on date " + date);
    }   
}