package lab7_assignment;

import java.util.Scanner;

public class Lab7_Assignment_Runner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Pizza testPizzaOne = new Pizza("large",1,1,2);
        System.out.println(testPizzaOne.getDescription()+"\nTotal Bill $"+testPizzaOne.calCost());
        System.out.println();
        Pizza testPizzaTwo = new Pizza();
        testPizzaTwo.setPizzaSize("Small");
        testPizzaTwo.setNumOfCheeseTopping(0);
        testPizzaTwo.setNumOfPepTopping(2);
        testPizzaTwo.setNumOfHamTopping(0);
        System.out.println(testPizzaTwo.getDescription());
        System.out.println("Total Bill $"+testPizzaTwo.calCost());

        String pizzaSize;
        int numOfCheeseTopping;
        int numOfPepTopping;
        int numOfHamTopping;

        System.out.println("-----------------------------------------------------------------");
        PizzaOrder order = new PizzaOrder();
        System.out.println("WELCOME TO PIZZA HUT.");
        System.out.println("Price List: Small Pizza $10 , Medium Pizza $12 , Large Pizza $14");
        System.out.println("Available Toppings: Cheese , Pepperoni , Ham , Price $2 per topping.");
        System.out.print("How many pizzas you want in you order (max 3): ");
        int pizzaCount = userInput.nextInt();
        if(pizzaCount>0 && pizzaCount<=3){
            System.out.println("Give your order: ");
            for(int i=0;i<pizzaCount;i++){
                System.out.print("Enter Pizza size (small/medium/large): ");
                pizzaSize = userInput.next();
                System.out.print("Enter Number of Cheese Topping: ");
                numOfCheeseTopping = userInput.nextInt();
                System.out.print("Enter Number of Pepperoni Topping: ");
                numOfPepTopping = userInput.nextInt();
                System.out.print("Enter Number of Ham Topping: ");
                numOfHamTopping = userInput.nextInt();
                order.setOrder(i,pizzaSize,numOfCheeseTopping,numOfPepTopping,numOfHamTopping);
                System.out.println();
            }
            System.out.println("Your total Bill is $"+order.calcTotal());
        } else
            System.out.println("Invalid Number of pizzas in a single order.");
    }
}