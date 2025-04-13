/*  A program that computes and then outputs the coefficients for a binomial expansion.*/

import java.util.Scanner;
import java.util.Arrays;

public class BinomialExpansion{

public static void main(String[] args) {

	
	int nFact = 0;
	int kFact = 0;
	int nkFact = 0;

	System.out.println("Binomial Expansion Coefficient Generator");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("\nPlease enter the exponent for the binomial as a positive integer: ");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt(); // value of exponent stored as n
	nFact = n;
	int[] coeff = new int[n + 1];
	
	// Now we compute n! in independent for loop.
	for(int i = n; i >= 0; i--){
		
		if((i == 1) || (i == 0)){	
			System.out.println("n! is presently " + nFact);
		}
		
		else {
			nFact = nFact*(i - 1);
			System.out.println("n! is presently " + nFact);
		}

	}
		//kFact = 1;
		//System.out.println("k! starts at " + kFact);
		
	//nkFact = n;  //start computation of (n-k)!
	//System.out.println("\n(n - k)! starts at " + nkFact);

	for(int k = 0; k <= n; k++){  //Calculate coefficient in this loop
						
		
		for(int j = k; j >= 0; j--){  //Compute k! and (n - k) in nested for loops
		
			kFact = j;
		
			if ((j == 1) || (j == 0)){
				kFact = 1;
				//kFact = kFact;
				System.out.println("\nk! is presently " + kFact);
				
			}
			
			else{
				kFact = kFact*(j - 1);
				System.out.println("k! is presently " + kFact);
			}	
			
			for(int p = n - k; p >= 0; p--){
			
			nkFact = p;
			
				if((p == 1) || (p == 0)){
				//nkFact = 1;
				nkFact = nkFact;
				System.out.println("p = 0 or 1");
				System.out.println("(n - k)! is presently " + nkFact);
				}
			
				else{
					nkFact = nkFact*(p - 1);
					System.out.println("(n - k)! is presently " + nkFact);
				}	
			}

		}	
		coeff[k] = nFact/(kFact*nkFact);
		System.out.println("coefficient is presently " + coeff[k]);
	
	}	
		
	System.out.println("The Coefficients of the binomial expansion are: " + Arrays.toString(coeff));
	
	
}

}
