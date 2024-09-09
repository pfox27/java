/*  A program that asks for 5 double values for distance from the user and then computes their average.    */

import java.util.Scanner;

public class Distance{

public static double CalcAvg(double a, double b, double c, double d, double e)
{
	double Avg = (a + b + c + d + e)/5;
	return Avg;
}

public static void main(String Args[])
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the value of A as a real number: ");
	double A = sc.nextDouble();
	System.out.println("Please enter the value of B as a real number: ");
	double B = sc.nextDouble();
	System.out.println("Please enter the value of C as a real number: ");
	double C = sc.nextDouble();
	System.out.println("Please enter the value of D as a real number: ");
	double D = sc.nextDouble();
	System.out.println("Please enter the value of E as a real number: ");
	double E = sc.nextDouble();
	double mean = CalcAvg(A,B,C,D,E);
	System.out.println("The average of the five values is:\n " + mean);

}

}








