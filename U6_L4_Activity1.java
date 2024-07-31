public class U6_L4_Activity1
{
public static void insert(String() words[] String newWord int place) {
  // Write your insert method here

		for (int i = words.length - 1; i > place - 1; i--)
			{
  				words[i] = words[i - 1];
			}
		words[place - 1] = newWord;
	
		return newWord;
	}
}
