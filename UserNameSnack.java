/*  A program that asks for the user's name and outputs it to the screen.   */

import java.util.Scanner;

public class UserNameSnack{


public static void main(String Args[]){
		
	Scanner myObj = new Scanner(System.in);
	System.out.println("Please enter your user name:");
	String userName = myObj.nextLine(); 
	System.out.println("Please enter your favourite snack:");
	String snack = myObj.nextLine(); 
	System.out.println(snack + " sounds delicious");
	
	}

}








