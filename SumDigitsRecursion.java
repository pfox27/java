import java.util.Scanner;


public class SumDigitsRecursion{
	
	public static int sumTotal(int n){
		
		if(n > 0){
			return n + sumTotal(n-1);
		}
		else{
			return n;
		}
	}
	public static void main(String[] args){
		
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("\nThe sum of all integers less than or equal to " + number + " is " + sumTotal(number));
	}
}


