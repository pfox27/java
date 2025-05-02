/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L3_Activity2 
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Hi there, what is your name?");
    String name = myObj.nextLine();
    System.out.println("Hi " + name + ", how old are ye?");
    short age = myObj.nextShort();
    System.out.println(name + " is " + age + " years old.");
    
  }
}

