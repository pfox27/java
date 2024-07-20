public class U6_L3_Activity1
{
  public static String findShortest(String[] words)
  {
    //Implement code to find and return the shortest String in wordList
    int shortestLength = 100;
    String shortestWord = "";
			for (int i = 0; i < words.length; i++)
				{
					if ((words[i].length()) < shortestLength)
						{
							shortestLength = words[i].length();
							shortestWord = words[i];
						}
				}
    return shortestWord;
  }
}
