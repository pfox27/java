/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity3
{
  public static void main(String[] args)
  {
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Java is an object-oriented programming language, true or false?");
    boolean response1 = myObj.nextBoolean();
    System.out.println("There are only two possible values that can be held by a boolean variable, true or false?");
    boolean response2 = myObj.nextBoolean();
    System.out.println("Question 1 - your answer: " + response1 + " Correct answer: true");
    System.out.println("Question 2 - your answer: " + response2 + " Correct answer: true");




    
  }
}
