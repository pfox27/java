/*  A program that computes the distance between two points on a cartesian plane, given their coordinates.   */

import java.util.Scanner;

public class VectorCalc3D{

public static double length(double a, double b, double c, double d, double e, double f)
{
	double dist = Math.sqrt((d-a)*(d-a) + (e-b)*(e-b) + (f-c)*(f-c));
	return dist;
}

public static void main(String Args[])
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the x-coordinate of the first point: ");
	double x1 = sc.nextDouble();
	System.out.println("Please enter the y-coordinate of the first point: ");
	double y1 = sc.nextDouble();
	System.out.println("Please enter the z-coordinate of the first point: ");
	double z1 = sc.nextDouble();
	System.out.println("Please enter the x-coordinate of the second point: ");
	double x2 = sc.nextDouble();
	System.out.println("Please enter the y-coordinate of the second point: ");
	double y2 = sc.nextDouble();
	System.out.println("Please enter the z-coordinate of the second point: ");
	double z2 = sc.nextDouble();

	//Now use the distance method to calculate the length of the line segment:

	double vectorLength = length(x1,y1,z1,x2,y2,z2); 
	
	System.out.println("\nThe length of the vector is:\n " + vectorLength);

}

}


