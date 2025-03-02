/* CheetahSpeed.java - A programme to calculate the speed of Chisholme Cheetah, given observations of the cheetah's motion while
   chasing Thomas Red Hawk.  */

import java.util.Scanner;

public class CheetahSpeed{

public static double maxSpeed(double[] speedArray, int numSpeeds){
	
	double max = 0.0;
	
		for(int f = 0; f < numSpeeds-1; f++){
				if(speedArray[f] > max){ 
					
					max = speedArray[f];
				}
			}
	return(max);
}

public static int[] sortTime(int[] timeList, int n){   // n is the number of values for time[]
	
	int temp;
	boolean swapped;
	swapped = true;
	
	System.out.println("\nUnsorted Times list: ");
		
			for(int c = 0; c < n; c++){
			System.out.println(timeList[c]);
			}
	
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
				
				System.out.println("\nTimes list: ");
				for(int g = 0; g < n; g++){
				System.out.println(timeList[g]);
			}
			} 
	}
		
	return (timeList);
}

public static int[] sortPosition(int[] positionList, int n){   // n is the number of values for time[]
	
	int temp;
	boolean swapped;
	swapped = true;
	System.out.println("The unsorted positions are: " + positionList);
	
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
				
				System.out.println("\nPositions list: ");
				for(int a = 0; a < n; a++){
				System.out.println(positionList[a]);
			}
			 
	}
	
	}
return (positionList);
}


public static void main(String Args[]){	
	
	Scanner sc = new Scanner(System.in);
	int numObs = 0;
	boolean legalNumObs = false;
	
	while(legalNumObs == false){
		
		System.out.println("\nPlease enter the number of observations (an integer >= 0): ");
		numObs = sc.nextInt();
		if(numObs >= 0){
			legalNumObs = true;
			}
			else{
				System.out.println("Sorry, the number of observations can't be negative.");
				legalNumObs = false;
		}
	}
		int[] obs = new int[numObs*2];
		
		//System.out.println("The number of observations will be: " + numObs);
		//int[] obs = {};
		//int[] position = {};
		//int[] time = {};
		//double[] instVelocity = {};
		int[] position = new int[numObs];
		int[] time = new int[numObs];
		double[] instSpeed = new double[numObs];

		boolean legalObs = false;
			

			for(int i = 0; i < numObs*2; i++){
				
				System.out.println("\nPlease enter the next observation (an integer representing time between 0 and 100000000 followed by an integer represtning position between -1000000 and 1000000):");
				obs[i]= sc.nextInt();
					
			}
			
		int pCount = 0;
		int tCount = 0;

/*		System.out.println("\nThe second data value is: " + obs[1]);     //Works up to here.
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("\n");
*/		
		
		for(int t = 0; t < numObs*2; t++){
			
				if(t%2 != 0){     // if index t is odd
					position[pCount] = obs[t];
				//	System.out.println("\nCurrent position is: " + position[pCount]);
					pCount++;
				}
				
				else{     // if index t is even
				time[tCount] = obs[t];
				//  System.out.println("\nCurrent time is: " + time[tCount]);
				tCount++;
			
				}				// In these loops, we create two separate arrays for position and time and make sure the indices start at 0.
			
			//System.out.println("\nCurrent time is: " + time[tCount]);
			//System.out.println("\nCurrent position is: " + position[pCount]);
			//System.out.println("tCount is: " + tCount);
			//System.out.println("pCount is: " + pCount);
			
			}
			
			/* System.out.println("\nTimes list: ");
		
			for(int k = 0; k < numObs; k++){
			System.out.println(time[k]);
			}
			
			System.out.println("\nPositions list: ");
			for(int b = 0; b < numObs; b++){
			System.out.println(position[b]);
			}
			*/		
	
			int[] sortedTime = sortTime(time, numObs);
			
			/*	System.out.println("\nFinal Sorted Times list: ");
				for(int r = 0; r < numObs; r++){
				System.out.println(sortedTime[r]);
				}
			*/

			int[] sortedPosition = sortPosition(position, numObs); 
			
			/*	
				System.out.println("\nFinal Sorted Positions list: ");
				for(int v = 0; v < numObs; v++){
				System.out.println(sortedPosition[v]);
				}
			*/

			for(int y = 0; y < numObs-1; y++){
				instSpeed[y] = (sortedPosition[y + 1] - sortedPosition[y])/(sortedTime[y + 1] - sortedTime[y]);
			}
		
					System.out.println("\n Instantaneous Speeds Are: ");

					for(int e = 0; e < numObs-1; e++){
				
				System.out.println(instSpeed[e]);
			}

		double highSpeed = maxSpeed(instSpeed, numObs);
		System.out.println("The maximum speed is: " + highSpeed + " m/s");
		

		}
		
		

	}

	


