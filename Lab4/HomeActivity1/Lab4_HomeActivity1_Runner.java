package lab4_;

public class Lab4_HomeActivity1_Runner {
    public static void main(String[] args){
        Marks studentOne = new Marks();
        studentOne.setMarksOne(50);
        studentOne.setMarksTwo(35);
        studentOne.setMarksThree(99);
        
        System.out.println("Maths: " + studentOne.getMarksOne());
        System.out.println("Eng: " + studentOne.getMarksTwo());
        System.out.println("Computer: " + studentOne.getMarksThree());
        System.out.print("Total marks are: ");
        studentOne.displayTotalMarks();
    }
}
