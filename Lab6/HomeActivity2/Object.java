package lab6_homeactivity2;

public class Object {
    
    public static int numberOfObjects;

    public Object(){
        numberOfObjects++;
    }

    public Object(int someValue){
        numberOfObjects++;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public static void destroy(Object object){
        object = null;
        numberOfObjects--;
    }
}
