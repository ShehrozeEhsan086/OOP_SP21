package lab3_assignment1;

public class Marks {
    public int marksOne;
    public int marksTwo;
    public int marksThree;
    
    public Marks(){
        marksOne = 1;
        marksTwo = 1;
        marksThree = 1;
    }
    
    public Marks(int marks1, int marks2, int marks3){
        marksOne = marks1;
        marksTwo = marks2;
        marksThree = marks3;
    }
    
    public int calculateSum(){
        int sum;
        sum = marksOne + marksTwo + marksThree;
        return sum;
    }
}
