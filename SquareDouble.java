import java.util.Scanner;

public class SquareDouble{

	public static void main(String[] args){
	
	Scanner scn = new Scanner(System.in);
	System.out.println("\nPlease enter the number to be squared: ");
	double val = scn.nextDouble();
	Square.square(val);
	
	
}

}
