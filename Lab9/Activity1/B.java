package lab9_activity1;

public class B extends A {

    int k;

    B(int a, int b, int c) {
        super(a,b);
        k = c;
    }

// display k – this overrides show() in A

    @Override
    void show() {
        System.out.println("k: " + k);
    }  
}