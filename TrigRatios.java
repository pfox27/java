/* A program that calculates the values of all six trigonometric ratios for a given angle. */

import java.util.Scanner;  //Initializing Scanner class

public class TrigRatios{

	public static void main(String args[]){

		// Declare variables
	        
		Scanner myObj = new Scanner(System.in);  // Create new Scanner object
		double degrees;
		double radians;
		double sine;
		double cosine;
		double tangent;
		double cosecant;
		double secant;
		double cotangent;
		
		System.out.println("Please enter angle in degrees:");
		int angle = myObj.nextInt(); 
		
		// Converting angle from degrees to radians
		degrees = angle;
		radians = angle * Math.PI/180;
		//Calculate the six trigonometric ratios
		sine = Math.sin(radians);
		cosine = Math.cos(radians);
		tangent = Math.tan(radians);
		cosecant = 1/sine;
		secant = 1/cosine;
		cotangent = 1/tangent;

		// Output trigonometric ratio information to the screen
        System.out.println("\nThe angle is " + degrees + " degrees, or " + radians + " radians.");
		System.out.println("\nThe Trigonometric Ratios for the angle are as follows:");
		System.out.println("\nsine = " + sine);
		System.out.println("\ncosine = " + cosine);
		System.out.println("\ntangent = " + tangent);
		System.out.println("\ncosecant = " + cosecant);
		System.out.println("\nsecant = " + secant);
		System.out.println("\ncotangent = " + cotangent);
	}
}


