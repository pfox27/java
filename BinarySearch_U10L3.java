/*
 * Unit 10 - Lesson 3 - Binary Search 
 */

import java.util.Scanner;
import java.util.Arrays;

class BinarySearch_U10L3
{
  public static int iterativeSearch(int[] numbers, int value)
  {
    int lowerIndex = 0;
    int upperIndex = numbers.length - 1;

    while (lowerIndex <= upperIndex)
    {
      int mid = (lowerIndex + upperIndex) / 2;
      if (value == numbers[mid])
      {
        return mid;
      }
      else if (value > numbers[mid])
      {
        lowerIndex = mid + 1;
      }
      else if (value < numbers[mid])
      {
        upperIndex = mid - 1;
      }
    }
    return -1;
  }

  /* public static void main(String[] args)
  {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int num = 1;
    int location = iterativeSearch(arr, num);

    System.out.println(num + " was found at index " + location);
  }
*/

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
	System.out.println("\nPlease enter the integer to be searched for: ");
	int intSearch = sc.nextInt();
	int[] numList = new int[num];
	
	for(int i = 0; i < num; i++){
		System.out.println("\nPlease enter the next integer to be placed in the list: ");
		numList[i] = sc.nextInt();  //Populate the unordered array of integers

	}
	
	//Call the sorting method (send unordered array as parameter as well as the size of the array)
	sortList(numList, num);
	System.out.println("\nThe sorted list is: " + Arrays.toString(numList));
	int number = 1;
    int location = iterativeSearch(numList, intSearch);  //Send freshly ordered array to the search method (array and integer to find as parameters)
	System.out.println(intSearch + " was found at index " + location);
}
}

