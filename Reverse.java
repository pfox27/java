/*  A program that asks the user to input a string and then outputs the reversed string.        */

import java.util.Scanner;

public class Reverse{

public static void Reverser(String x) {
        
	System.out.println("The reversed word or phrase is: ");

	for (int i = x.length(); i >= 1; i--){
	       /* System.out.println("\nThe first character in the reversed word or phrase is " + x.charAt(i - 1)); */	
	       /* System.out.println("\nThe string length is " + x.length()); */	
	       char letter = x.charAt(i - 1);
	       System.out.print(letter);
	}	       
}
		
public static void main(String Args[]){

Scanner sc = new Scanner(System.in);
System.out.println("\nPlease input the string you'd like reversed:");
String wordOrPhrase = sc.nextLine();
Reverser(wordOrPhrase);
System.out.println("");

	}
}








