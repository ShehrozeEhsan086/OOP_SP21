package lab7_assignment;

public class PizzaOrder {

    Pizza[] order = new Pizza[3];

    public void setOrder(int pizzaNumber,String pizzaSize,int numOfCheeseTopping, int numOfPepTopping, int numOfHamTopping){
        if(order[pizzaNumber] == null){
            Pizza temp = new Pizza(pizzaSize,numOfCheeseTopping,numOfPepTopping,numOfCheeseTopping);
            order[pizzaNumber] = temp;
        } else
            System.out.println("Pizza Number "+pizzaNumber+1+" order has already been taken.");
    }

    public double calcTotal(){
        double totalCost = 0;
        for(int i=0;i<3;i++){
            if (order[i] != null){
                totalCost = totalCost + order[i].calCost();
            } else
                continue;
        }
        return totalCost;
    }
}