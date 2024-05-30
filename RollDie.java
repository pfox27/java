/* A program that simulates the rolling of a die, the number of sides of which are provided by the user. */

import java.util.Scanner;

public class RollDie{
	
	public static void main(String[] args){
		
		int numberOfSides = 6;
		System.out.println("Die Rolling Simulator");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of sides of the die to be cast: ");
		numberOfSides = scan.nextInt();
		//Die die = new Die();
		System.out.println("The number of sides is: " + numberOfSides);
		
		if(numberOfSides == 6){
			//die = new Die(6);
			Die die = new Die();
		}
		else{
			Die die = new Die(numberOfSides);
		}
		}
	}
	
		
