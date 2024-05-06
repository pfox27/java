/*  A program that calculates the perimeter of a regular polygon given the number of sides and the side length.       */

import java.util.Scanner;

public class HourOfDay{

public static void timeOfDay(int x) {
	if (x == 0)
		System.out.println("\nThe hour of day is Midnight.");
	else if (x == 12)
		System.out.println("\nThe hour of the day is Noon.");
	else if (x == 18)
		System.out.println("\nThe hour of the day is Dusk.");
	else if (0 < x && x < 12)
		System.out.println("\nThe hour of the day is in the Morning.");
	else if (12 < x && x < 18)
		System.out.println("\nThe hour of the day is in the Afternoon.");
	else if (18 < x && x < 24)
		System.out.println("\nThe hour of the day is Evening.");
}
		
public static void main(String Args[]){

Scanner sc = new Scanner(System.in);
System.out.println("\nPlease input the current hour of the day (24-hour clock):");
int hourOfDay = sc.nextInt();
timeOfDay(hourOfDay);


	}
}








