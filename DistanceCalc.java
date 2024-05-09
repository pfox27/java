/*  A program that computes the distance between two points on a cartesian plane, given their coordinates.   */

import java.util.Scanner;

public class DistanceCalc{

public static double distance(double a, double b, double c, double d)
{
	double dist = Math.sqrt((c-a)*(c-a) + (d-b)*(d-b));
	return dist;
}

public static void main(String Args[])
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the x-coordinate of the first point: ");
	double x1 = sc.nextDouble();
	System.out.println("Please enter the y-coordinate of the first point: ");
	double y1 = sc.nextDouble();
	System.out.println("Please enter the x-coordinate of the second point: ");
	double x2 = sc.nextDouble();
	System.out.println("Please enter the y-coordinate of the second point: ");
	double y2 = sc.nextDouble();

	System.out.println("Please enter the value of E as a real number: ");
	
	//Now use the distance method to calculate the length of the line segment:

	double length = distance(x1,y1,x2,y2); 
	
	System.out.println("\nThe length of the vector is:\n " + length);

}

}








