/** A program that uses the class Plane to adjust the altitude of an aircraft. 
 * <p>
 * @return location - An integer representing the current altitude of Plane.
 *  
 * */

import java.util.Scanner;

public class RunnerPlane
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
	int altitude = 0;
    Plane p = new Plane();
    String command = "";

    while (!command.equals("q")) 
    {
      System.out.println("Type 'u' to move upwards, 'd' to move downwards, 'n' for new Plane, 'q' to quit.");
	  command = scan.next();

      if (command.equals("u")) 
      {
          p.upward();
          System.out.println("Plane altitude is now " + p.getLocation());
	  }
	
      else if (command.equals("d")) 
      {
          p.downward();
          //p.getLocation();
          System.out.println("Plane altitude is now " + p.getLocation());
      }
      else if(command.equals("n")){
        System.out.println("Starting location for a new Plane?");
        int start = scan.nextInt();
        p = new Plane(start);
        scan.nextLine();
    }
}
}
}
