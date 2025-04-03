import java.util.Scanner;


public class PrintDigits{
	
	public static void printDigits(int n){
		System.out.println(n % 10);
		if(n/10 > 0){
			printDigits(n / 10);
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		printDigits(number);
	}
}


