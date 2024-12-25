/* A programme that asks the user to enter numbers to be stored in an array and then outputs the largest number entered and stored. */

import java.util.Scanner;

public class MaxNumberInArray{
	public static void main (String args[]){

		int[] numberList;
		int maxValue = 0;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the number of numerical values to be stored:");
		int NumberOfValues = myObj.nextInt();
		numberList = new int[NumberOfValues];

			for(int i = 0; i < NumberOfValues; i++){

				System.out.println("Please enter the next numerical value:");
				numberList[i] = myObj.nextInt();
				if (numberList[i] > maxValue)
					maxValue = numberList[i];
			}
		
		System.out.println("The maximum numerical value stored is: " + maxValue);

			}
}



