/* runnerU7L2_Activity2.java - A program that uses an integer arraylist. */

import java.util.Scanner;
import java.util.ArrayList;

public class runnerU7L2_Activity2{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> vals = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      vals.add(scan.nextInt());
    }
    System.out.println("Highest Number: " + U7L2_Activity2.highestNum(vals));
  }
}

