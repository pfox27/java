/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L3_Activity1 
{
  public static void main(String[] args) 
  {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Please enter three decimal numbers:");
    double number1 = myObj.nextDouble();
    double number2 = myObj.nextDouble();
    double number3 = myObj.nextDouble();
    System.out.println(number3 + "," + number2 + "," + number1);

  }
}

