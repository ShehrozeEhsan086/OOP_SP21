package lab11_labactivity1;

public class Lab11_LabActivity1_Runner {
    public static void main(String[] args) {
        EmployeeTask employeeOne = new EmployeeTask("Altaf","2nd June 2012",100_000);
        employeeOne.register();
        
        StudentTask studentOne = new StudentTask("Tahaa",21,3.5);
        studentOne.register();
    }
}