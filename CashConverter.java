/* Lesson 2 Coding Activity Question 4 - cashConverter. */

import java.util.Scanner;

public class CashConverter{

  /* Add the method coinConverter() here */

public static void coinConverter(int x){

	int dollars = x/100;
	int leftover = x%100;
	int quarters = leftover/25;
	leftover = leftover%25;
	int dimes = leftover/10;
	leftover = leftover%10;
	int nickels = leftover/5;
	leftover = leftover%5;
	int penniesLeft = leftover;
	System.out.println("Dollar Bills: " + dollars);
	System.out.println("Quarters: " + quarters);
	System.out.println("Dimes: " + dimes);
	System.out.println("Nickels: " + nickels);
	System.out.println("Pennies: " + penniesLeft + "\n");

}

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  
  public static void main(String[] args){
  	
	System.out.println("\nCash Converter - Converts from Pennies to Other Denominations");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	Scanner scn = new Scanner(System.in);
	System.out.println("\nPlease enter the number of pennies you'd like converted to other denominations:\n");

	int pennies = scn.nextInt();
	coinConverter(pennies);

  }
  
}





