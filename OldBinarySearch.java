/* Binary search programme - Sorts a list of integers and then finds the position of a chosen integer in the ordered list. */

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{

public static int[] sortList(int[] intList, int n){   // n is the number of values for intList[]
	
	//int temp;
	//boolean swapped;
	//swapped = true;
	
	System.out.println("\nUnsorted Integers list: ");
	System.out.println(Arrays.toString(intList));
			
	//while(swapped == true){
		
			//for(int p = 0; p < n-1; p++){
				//if(intList[p] > intList[p+1]){
					// swap intList[p] and intList[p+1] 
					
					//temp = intList[p];
					//intList[p] = intList[p+1];
					//intList[p+1] = temp;
					//swapped = true;
				//}
				//else{
					//swapped = false;
				//}
				
				Arrays.sort(intList);
				
				System.out.println("\nInteger list: ");
				System.out.println(Arrays.toString(intList));
				return (intList);
			} 
	

public static void main(String[] args){
	
	//int[] numList = {0};
	int num = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the number of integers to be in the list: ");
	num = sc.nextInt();
	int[] numList = new int[num];
	
	for(int i = 0; i < num; i++){
		System.out.println("\nPlease enter the next integer to be placed in the list: ");
		numList[i] = sc.nextInt();

	}
	
	sortList(numList, num);
	System.out.println("\nThe sorted list is: " + Arrays.toString(numList));
	
	}
}
