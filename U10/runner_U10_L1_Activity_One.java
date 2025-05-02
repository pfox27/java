import java.util.Scanner;


public class runner_U10_L1_Activity_One
{

  public static void main(String[] args)
  {
    System.out.println("Enter positive integer:");
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    int c = 1;
    U10_L1_Activity_One.printUpToEnd(i, c);
    System.out.println();
  }
  
}

