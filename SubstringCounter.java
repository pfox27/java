/*  A program that counts the number of times a substring is repeated in a particular string.  Both String and substring are obtained from user input.   */

import java.util.Scanner;

public class SubstringCounter{

public static int substringCount(String word, String phrase)
{
	//int countLetter = 0;
	int countWord = 0;

	for(int i = 0; i < word.length(); i++)
	{
		for(int j = i + 1; j < word.length(); j++)
		{
			if(word.substring(i,j).equals (phrase))
				countWord++;
		}
	
	}
	
	//return countLetter;
	return countWord;
}

public static void main(String Args[])
{
	System.out.println("\nSubstring Counter!!");
	System.out.println("~~~~~~~~~~~~~~~~~~~");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nPlease enter the larger word or phrase to be checked: ");
	String textBig = sc.nextLine();
	System.out.println("Please enter the smaller word or phrase to be checked against the larger one: ");
	String textSmall = sc.nextLine();
	
	
	int tally = substringCount(textBig, textSmall); 
	
	System.out.println("\nThe number of times the smaller word or phrase appears in the larger one is: " + tally);
	}

	//System.out.println("\nThe number of times " + textSmall + "appears in " + textBig + " is " + tally);
	//System.out.println("\n");

}




