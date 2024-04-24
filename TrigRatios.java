/* A program that calculates the values of all six trigonometric ratios for a given angle. */

public class TrigRatios{

	public static void main(String args[]){

		// Declare variables
	
		double degrees;
		double radians;
		double sine;
		double cosine;
		double tangent;
		double cosecant;
		double secant;
		double cotangent;

		degrees = 30;
		radians = 30 * Math.PI/180;
		sine = Math.sin(radians);
		cosine = Math.cos(radians);
		tangent = Math.tan(radians);
		cosecant = 1/sine;
		secant = 1/cosine;
		cotangent = 1/tangent;

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





        









