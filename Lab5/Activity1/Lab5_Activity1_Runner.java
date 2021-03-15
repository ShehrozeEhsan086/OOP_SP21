package lab5_activity1;

public class Lab5_Activity1_Runner {
    public static void main(String[] args){
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        ObjectPass.increment(p);
        System.out.println("After calling: " + p.value);
    }
}
