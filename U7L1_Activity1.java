//U7L1_Activity1.java

import java.util.Scanner;
import java.util.ArrayList;

public class U7L1_Activity1
{

  public static void main(String[] args)
  {
    String word = new String("Tqaargg");
    int count = 0;
    String halt = new String("stop");
    int wordsLength;
    ArrayList<String> words = new ArrayList<String>();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    while(word.equalsIgnoreCase(halt) = false){
	System.out.println("Enter a word: ");
	word = myObj.nextLine();  // Read user input 
  	words.add(word);
count++;
  }
	wordsLength = words.size();
	System.out.println("The size of the ArrayList \"words\" is:" + wordsLength);
			for(int i = 0; i < count; i++){
			     System.out.println("Word List:");
			     System.out.println(words.get(i));

			}	
	}
}
