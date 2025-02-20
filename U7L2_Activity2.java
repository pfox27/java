import java.util.ArrayList;

public class U7L2_Activity2
{

  // write your highestNum method here

	int maxNum = 0;

	public static int highestNum(int values){
		 ArrayList<int> numList = new ArrayList<int>();
                 for(int i = 0; i < values.size(); i++){
		 	int currentNum = values.get(i);
			if(currentNum > maxNum){
				maxNum = currentNum;
			}
		return maxNum;	
		}
	}
}
