/* Lesson 8 Coding Activity Question 1 */

import java.util.Scanner;
//import testing.Math;

public class U2_L8_Activity1
{
  public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = myObj.nextInt();  //Getting user input.
    double rand1 = Math.random();  //Generating random decimal number.
    System.out.println("Rand is: " + rand1);  //Flag to diagnose random decimal number

    int range = n;  
    int min = 2;
    int answer1 = (int)(rand1 * range) + min; //Converting random decimal number to integer in desired range.
    double rand2 = Math.random();
    System.out.println("Rand is: " + rand2);  //Flag to diagnose random decimal number
    int answer2 = (int)(rand2 * range) + min;
    double rand3 = Math.random();
    System.out.println("Rand is: " + rand3);  //Flag to diagnose random decimal number
    int answer3 = (int)(rand3 * range) + min;
    System.out.println(answer1);  //Outputting three random integers.
    System.out.println(answer2);
    System.out.println(answer3);

  }
}

