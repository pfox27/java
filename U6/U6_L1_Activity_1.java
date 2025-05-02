import java.util.Scanner;

public class U6_L1_Activity_1
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);
    
    //double[] arr = new int(3);
    double[] arr = new double[3];
    arr[1] = scan.nextDouble();
    arr[2] = scan.nextDouble();
    arr[3] = scan.nextDouble();
    
    //System.out.println("Contents: " + arr(1) + " " + arr(2) + " " + arr(3));
    System.out.println("Contents: " + arr[1] + " " + arr[2] + " " + arr[3]);
    System.out.println("Sum: " + arr[1] + arr[2] + arr[3]);

  }
}
