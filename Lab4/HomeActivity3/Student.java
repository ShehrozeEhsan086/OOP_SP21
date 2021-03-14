package lab4_homeactivity3;

public class Student {
    
    private String name;
    private int[] resultArray = new int[5];

    public Student(String studentName, int[] studentResult){
        name = studentName;
        resultArray = studentResult;
    }

    public float average(){
        int totalMarks = 0, i=0;
        while(i<5){
            totalMarks = totalMarks + resultArray[i];
            i++;
        }
        float average = totalMarks/5;
        System.out.println("Average for student "+name+" is "+average);
        return average;
    }
}
