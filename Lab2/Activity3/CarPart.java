package l2a3;

public class CarPart {
    private String modelName;
    private String partNumber;
    private String cost;
    
    public void setparameter(String x, String y, String z){
        
        modelName = x;
        partNumber = y;
        cost = z;
        
    }
    
    public void display(){
        System.out.println("Model Number: "+ modelName + " Part Number: "+ partNumber + " Cost: "+ cost);
    }  
}
