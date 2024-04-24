/* A program to calculate the simple interest earned for a given investment. */

public class SimpleInterest {
	public static void main(String args[]){
		/* Declare variables */

		double principal;  /* The amount of money invested in dollars */
		double rate;       /* The interest rate as a percent */
		double interest;   /* The amount of interest earned in dollars */
		
		/* Calculations */

		principal = 56000;  
		System.out.println("\nThe original amount invested (principal) is $" + principal);
                rate = 5.9;
		interest = principal * rate/100;
                principal = principal + interest;

		/* Output results */

            
                //System.out.println("\nThe original amount invested (principal) is $" + principal);
		System.out.println("\nThe interest rate is " + rate + "%");
		//System.out.println(rate);
		//System.out.println("%.");
		System.out.println("\nThe interest earned is $" + interest);
		//System.out.println(interest);
		System.out.println("\nThe new value for the principal is $" + principal);
		//System.out.println(principal);
		System.out.println("\n");
	} // End of main
} // End of class SimpleInterest








