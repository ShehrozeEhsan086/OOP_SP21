package lab7_assignment;

public class Pizza {

    private String pizzaSize;
    private int numOfCheeseTopping;
    private int numOfPepTopping;
    private int numOfHamTopping;

    public  Pizza(){
        pizzaSize = "";
        numOfHamTopping = 0;
        numOfPepTopping = 0;
        numOfCheeseTopping = 0;
    }

    public Pizza(String pizzaSize,int numOfCheeseTopping, int numOfPepTopping, int numOfHamTopping){
        this.pizzaSize = pizzaSize;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfHamTopping = numOfHamTopping;
        this.numOfPepTopping = numOfPepTopping;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfPepTopping(int numOfPepTopping) {
        this.numOfPepTopping = numOfPepTopping;
    }

    public void setNumOfHamTopping(int numOfHamTopping) {
        this.numOfHamTopping = numOfHamTopping;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfPepTopping() {
        return numOfPepTopping;
    }

    public int getNumOfHamTopping() {
        return numOfHamTopping;
    }

    public double calCost(){
        int toppingCharges = (numOfCheeseTopping*2)+(numOfPepTopping*2)+(numOfHamTopping*2);
        pizzaSize = pizzaSize.toLowerCase();
        if (pizzaSize.equals("small")){
            return (10+toppingCharges);
        } else if(pizzaSize.equals("medium")){
            return (12+toppingCharges);
        } else if(pizzaSize.equals("large")){
            return (14+toppingCharges);
        } else{
            System.out.println("Pizza size Invalid.");
            return 0;
        }
    }

    public String getDescription(){
        return "Pizza Size: "+pizzaSize+"\nNumber of Cheese Topping: "+numOfCheeseTopping+" \nNumber of Pepperoni Topping: "+numOfPepTopping+" \nNumber of Ham Topping: "+numOfHamTopping;
    }
}