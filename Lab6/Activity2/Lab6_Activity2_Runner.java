package lab6_activity2;

public class Lab6_Activity2_Runner {
    public static void main(String[] args) {
        NoOfObjects o1=new NoOfObjects();
        NoOfObjects o2=new NoOfObjects(122);
        NoOfObjects o3=new NoOfObjects(150);
        System.out.println("Objects created:"+ NoOfObjects.getObjs());
        System.out.println("Objects created:"+ o1.getObjs());
    }
}
