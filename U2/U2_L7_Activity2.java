import java.util.Scanner;

public class U2_L7_Activity2
{
  public static void main(String[] args)
  {
  
    Scanner myObj = new Scanner(System.in);
    Long x = null;
    Long y = null;

    System.out.println(x + " " + y);
    System.out.println("Enter values:");
    x = myObj.nextLong();
    y = myObj.nextLong();

    Double avg = (double)((x + y) / 2);
    System.out.println("Average of " + x + " and " + y + " is " + avg);
  }
}

