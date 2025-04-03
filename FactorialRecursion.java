import java.util.Scanner;


public class FactorialRecursion{
	
	public static int factorial(int n){
		
		if(n == 0){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args){
		
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("\nThe factorial of " + number + " is " + factorial(number));
	}
}


