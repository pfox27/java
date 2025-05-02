public class U6_L3_Activity2
{ 
  public static void removeVowels(String[] words)
  {
    //Implement code to print each string from words with only non-vowels on a new line
    String[] noVowelWords = new String[words.length];
    
			for (int i = 0; i < words.length; i++)
				{   
					String[] tempWord = new String[words[i].length()];
					for (int j = 0; j < words[i].length(); j++)
					     {
							 if((words[i].charAt(j)) == "a")
							 {
								 tempWord[j] = words[i].charAt(j);
							 }
								 
				}
      noVowelWords[i] = tempWord;
  }
 
 for(k = 0; k < noVowelWords.length; k++)
	{
	    System.out.println(noVowelsWords[k]);
	}
}
}
