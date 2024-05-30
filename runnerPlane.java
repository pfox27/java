/* A program that uses the class Plane to adjust the altitude of an aircraft. */

import java.util.Scanner;

public class RunnerPlane
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
	int altitude = 0;
    Plane plane = new Plane(altitude);
    String command = "";

    while (!command.equals("q")) 
    {
      System.out.println("Type 'u' to move upwards, 'd' to move downwards, 'n' for new Plane, 'q' to quit.");
	  command = scan.next();

      if (command.equals("u")) 
      {
          plane.upward();
	  }
	
      else if (command.equals("d")) 
      {
          plane.downward();
      }
    
      else if (command.equals("n"))
      {
		  Plane plane = new Plane(altitude);
      }
    
    }
}
}
