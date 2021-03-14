package lab4_homeactivity3;

public class Lab4_HomeActivity3_Runner {
    public static void main(String[] args) {

        Student studentOne = new Student("Khan",new int[] {20,23,25,21,19});
        Student studentTwo = new Student("Ali",new int[] {18,24,22,23,12});
        Student studentThree = new Student("Taha",new int[] {22,28,33,12,9});

        float averageMarksStudentOne = studentOne.average();
        float averageMarksStudentTwo = studentTwo.average();


        if (averageMarksStudentOne > averageMarksStudentTwo){
            System.out.println("Student One has higher average marks.");
        } else{
            System.out.println("Student Two has higher average marks.");
        }
    }
}
