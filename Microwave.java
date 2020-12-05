//Scan all primitive data types
import java.util.Scanner;

public class Microwave {

  public static void main(String[] args) {
    
    //Declare the type of food the user may input
    String mealinput;

    Scanner microwave = new Scanner(System.in);
    
    //Intro
    System.out.println("Hello! Here to warm up a tasty snack? This is the place to be!");

    //User input process
    System.out.println("Our choices are the following ; Sub, Pizza and Soup");
    mealinput = microwave.nextLine();

    double rate = 0;
    if (mealinput.equalsIgnoreCase("Sub")) {
      rate = 60;
    } else if (mealinput.equalsIgnoreCase("Pizza")) {
      rate = 45;
    } else if (mealinput.equalsIgnoreCase("Soup")) {
      rate = 105;
    } else {
      System.err.println("Sorry we dont have any " + mealinput + ". Bye Bye");
      //Close the program as the value inputted is not qualified to continue through the program
      System.exit(0);

    }
    int amount;
    //User Input for quantity
    System.out.println("Great choice! I love to have some " + mealinput + " later.");
    System.out.println("How many " + mealinput + "(s) would you like. (choice from 1 to 3) ");
    amount = microwave.nextInt();
    
    if ((amount == 1) || (amount == 2) || (amount == 3)) {
      //Calulating Process
      double cookTime;
      //Calculating using the provided variables and the user's input
      cookTime = rate + (rate * (0.5 * (amount - 1)));

      //Output the time to cook the meal 
      System.out.println("It will take " + cookTime + "s to cook.");
    } else {
      System.err.println("Sorry we dont have " + amount + " of " + mealinput + ". Bye Bye");
      //Close the program as the value inputted is not qualified to continue through the program
      System.exit(0);
    }
  }
}
