/*  A program that computes and then outputs the coefficients for a binomial expansion.*/

import java.util.Scanner;
import java.util.Arrays;

public class BinomialExpansion{

public static int main(String[] args) {

	int[] coeff;
	int nFact = 0;
	int kFact = 0;
	int nkFact = 0;

	System.out.println("Binomial Expansion Coefficient Generator");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("\nPlease enter the exponent for the binomial as a positive integer:");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt(); // value of exponent stored as n
	nFact = n;

	// Now we compute n!
	for(int i = n; i >= 2; i--){
		nFact = nFact*(i - 1);
	}
	
	for(int k = 1; k <= n; k++){
		//Compute k!
		kFact = k;
		
		for(int j = k; j >= 2; j--){
		kFact = kFact*(j - 1);
		}	
			nkFact = n - k;
			for(int p = n - k; p >= 2; p--){
				nkFact = nkFact*(i - 1);
			}	

		coeff[k] = nFact/(kFact*nkFact);

	}
	
	System.out.println("The Coefficients of the binomial expansion are: " + Arrays.toString(coeff));
	}
}

