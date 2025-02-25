/* CheetahSpeed.java - A programme to calculate the speed of Chisholme Cheetah, given observations of the cheetah's motion while
   chasing Thomas Red Hawk.  */

import java.util.Scanner;

public class CheetahSpeed{

public static void main(String Args[])
{	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the number of observations: ");
	int numObs = sc.nextInt();
	int observations[];
	int position[];
	int time[];
	double instVelocity[];

	for(int i = 0; i < numObs; i++){
		System.out.println("\nPlease enter the next observation:");
		String obs[]= sc.nextLine().split(" "); //read user input as a line (String) and split it into parts at each space
			for(int j = 0 ; j < obs.length; j++){
    			observations[j] = Integer.parseInt(obs[j]);
			}
		
		int pCount = 0;
		int tCount = 0;
		
		for(int t = 0; t < observations.length; t++){
			
			if(t%2 != 0){     // if t is odd
				position[pCount] = observations[t];
				pCount++;
			}
			else{     // if t is even
				time[tCount] = observations[t];
				tCount++;
			}				// In these loops, we create two separate arrays for position and time and make sure the indices start at 0.


			for(int y = 0; y < observations.length; y++){
				instVelocity[y] = (position[y + 1] - position[y])/(time[y + 1] - time[y]);
			}


			}
		
		

		}

	}

}
