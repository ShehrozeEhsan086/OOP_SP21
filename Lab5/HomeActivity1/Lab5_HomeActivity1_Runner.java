package lab5_homeactivity1;

public class Lab5_HomeActivity1_Runner {
    public static void main(String[] args) {

        Distance D1 = new Distance(6,4);

        Distance D2 = new Distance();
        D2.setFeet(5);
        D2.setInches(2);

        Distance D3;
        D3=D1.Add(D2);
        D3.Display();
    }
}
