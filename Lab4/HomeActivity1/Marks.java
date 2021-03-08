package lab4_;

public class Marks {
    private int marksOne;
    private int marksTwo;
    private int marksThree;
    
    public void setMarksOne(int marks1){
        marksOne = marks1;
    }
    
    public void setMarksTwo(int marks2){
        marksTwo = marks2;
    }
    
    public void setMarksThree(int marks3){
        marksThree = marks3;
    }
    
    public int getMarksOne(){
        return marksOne;
    }
    
    public int getMarksTwo(){
        return marksTwo;
    }
    
    public int getMarksThree(){
        return marksThree;
    }
    
    public void displayTotalMarks(){
        System.out.println(marksOne+marksTwo+marksThree);
    }
    
}
