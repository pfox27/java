/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L4_Activity2{
  public static void main(String[] args){
  
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a word:");
    String str1 = myObj.nextLine();
    String str2 = new String(str1);
    str1 = str1.toUpperCase();
    //str2 = str2.toUpperCase();
    String str3 = new String();
    str3 = (str1.substring(0,1) + str2.substring(1, str2.length()));
    str2 = str3;
    System.out.println(str1);
    System.out.println(str2);
  
  }
}
