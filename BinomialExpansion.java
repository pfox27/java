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
	int[] coeff = new int[n];
	
	// Now we compute n!
	for(int i = n; i >= 2; i--){
		nFact = nFact*(i - 1);
		System.out.println("n! is presently " + nFact);
	}
	
	for(int k = 1; k <= n; k++){
		//Compute k!
		kFact = k;
		
		for(int j = k; j >= 2; j--){
		
			if (j == 1){
				kFact = 1;
			}
		
			else{
				kFact = kFact*(j - 1);
				System.out.println("k! is presently " + kFact);
			}	
			
			nkFact = n - k;  //compute (n-k)!
			
			for(int p = n - k; p >= 2; p--){
			
				if(p == 1){
				nkFact = 1;
				}
			
				else{
					nkFact = nkFact*(p - 1);
					System.out.println("(n - k)! is presently " + nkFact);
				}	

		coeff[k] = nFact/(kFact*nkFact);

		}	
	
		}
		
	}
	System.out.println("The Coefficients of the binomial expansion are: " + Arrays.toString(coeff));
	}
	
}


