package lab9_assignment_q2;

public class Lab9_Assignment_Q2_Runner {
    public static void main(String[] args) {
        CustomStringTokenizer string = new CustomStringTokenizer("abc1 asdakj adsa");
        System.out.println("Total number of token except numeric: "+string.countTokens());
    }
}