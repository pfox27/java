/* U7L2_Activity2.java - A method to find the highest integer in an ArrayList. */

import java.util.ArrayList;

public class U7L2_Activity2
{

  // write your highestNum method here

	static int maxNum = 0;

	public static int highestNum(ArrayList<Integer> values){
		 //ArrayList<Integer> numList = new ArrayList<Integer>();
                 for(int i = 0; i < values.size(); i++){
		 	int currentNum = values.get(i);
			if(currentNum > maxNum){
				maxNum = currentNum;
			}
			
		}
	   return maxNum;
	}
}
