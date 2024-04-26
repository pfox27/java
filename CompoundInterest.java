/* A programme to calculate the compound interest earned by an investment and the new total value of the investment. */

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String args[]){

		System.out.println("\nPlease enter the principal investment in dollars: \n");
		Scanner scn = new Scanner (System.in);
		double P = scn.nextDouble();
		System.out.println("\nPlease enter the interest rate as a percent: \n");
		double Percent = scn.nextDouble();
		double r = Percent/100;
		System.out.println("\nPlease enter the number of years for which the funds will be invested: \n");
		double t = scn.nextDouble();
		System.out.println("\nPlease enter the number of times per year that the interest will be calculated: \n");
		double n = scn.nextDouble();
		double NewValue = P * (Math.pow((1 + (r/n)),(n*t)));
		double Interest = NewValue - P;

	//System.out.println("\nThe value of r/n is \n" + r/n);
	//System.out.println("\nThe value of n*t is \n" + n*t);

		System.out.println("\nThe Interest earned by the investment is \n" + Interest);
		System.out.println("\nThe new value of the investment is \n" + NewValue + "\n");
		
		scn.close();

	}
}













