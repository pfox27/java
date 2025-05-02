import java.util.Scanner;


public class PrintDigits2{
	
	public static void printDigits2(int n){
		
		if(n >= 10){
			printDigits2(n / 10);
		}
		System.out.println(n % 10);
	}
	
	public static void main(String[] args){
		
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		printDigits2(number);
	}
}


