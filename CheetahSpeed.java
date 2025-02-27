/* CheetahSpeed.java - A programme to calculate the speed of Chisholme Cheetah, given observations of the cheetah's motion while
   chasing Thomas Red Hawk.  */

import java.util.Scanner;

public class CheetahSpeed{

public static int[] sortTime(int[] timeList, int n){   // n is the number of values for time[]
	
	int temp;
	boolean swapped;
	swapped = true;
	
	while(swapped == true){
		
			for(int p = 0; p < n-1; p++){
				if(timeList[p] > timeList[p+1]){
					// swap timeList[p] and timeList[p+1] 
					
					temp = timeList[p];
					timeList[p] = timeList[p+1];
					timeList[p+1] = temp;
					swapped = true;
				}
				else{
					swapped = false;
				}
			}
			 System.out.println("The sorted times are: " + timeList);
	}

	return (timeList);
}

public static int[] sortPosition(int[] positionList, int n){   // n is the number of values for time[]
	
	int temp;
	boolean swapped;
	swapped = true;
	
	while(swapped == true){
		
			for(int p = 0; p < n-1; p++){
				if(positionList[p] > positionList[p+1]){
					// swap positionList[p] and positionList[p+1] 
					
					temp = positionList[p];
					positionList[p] = positionList[p+1];
					positionList[p+1] = temp;
					swapped = true;
				}
				else{
					swapped = false;
				}
			}
			 
	}
		System.out.println("The sorted positions are: " + positionList);
	return (positionList);
}


public static void main(String Args[])
{	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the number of observations: ");
	int numObs = sc.nextInt();
	int realNumObs = numObs*2;
    int[] obs = new int[realNumObs];
	System.out.println("The number of observations will be: " + numObs);
	//int[] obs = {};
	//int[] position = {};
	//int[] time = {};
	//double[] instVelocity = {};
	int[] position = new int[realNumObs];
	int[] time = new int[realNumObs];
	int[] instSpeed = new int[realNumObs];

	for(int i = 0; i < numObs*2; i++){
		System.out.println("\nPlease enter the next observation:");
		obs[i]= sc.nextInt();
		System.out.println("Current observation is: " + obs[i]);
			}
		
		System.out.println("\nObservations list: ");
		
			for(int m = 0; m < realNumObs; m++){
			System.out.println(obs[m]);
			}
		
		int pCount = 0;
		int tCount = 0;
		
		for(int t = 0; t < obs.length; t++){
			
				if(t%2 != 0){     // if index t is odd
					position[pCount] = obs[t];
					pCount++;
				}
				
				else{     // if index t is even
				time[tCount] = obs[t];
				tCount++;
			
				}				// In these loops, we create two separate arrays for position and time and make sure the indices start at 0.
			
			System.out.println("Current time is: " + time[tCount]);
			System.out.println("Current position is: " + position[pCount]);
			System.out.println("tCount is: " + tCount);
			System.out.println("pCount is: " + pCount);
			
			}

			int[] sortedTime = sortTime(time, numObs);
			int[] sortedPosition = sortPosition(position, numObs);  

			for(int y = 0; y < obs.length; y++){
				instSpeed[y] = (position[y + 1] - position[y])/(time[y + 1] - time[y]);
			}


			}
		
		

		}

	


