public class U6_L3_Activity2
{ 
  public static void removeVowels(String[] words)
  {
    //Implement code to print each string from words with only non-vowels on a new line
    for(int i = 0; i < words.length; i++)
    {   for(int j = 0; j < words[i].length(); j++)
		{
			if (words[i].charAt(j) == 'a' || words[i].charAt(j) == 'e'
                || words[i].charAt(j) == 'i' || words[i].charAt(j) == 'o'
                || words[i].charAt(j) == 'u' || words[i].charAt(j) == 'A'
                || words[i].charAt(j) == 'E' || words[i].charAt(j) == 'I'
                || words[i].charAt(j) == 'O'
                || words[i].charAt(j) == 'U') { 
                continue; 
            } 
            else { 
                System.out.print(words[i].charAt(j));
			}
		}
		System.out.println("");
	}
}	
}
