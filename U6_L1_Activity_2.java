import java.util.Scanner;
public class U6_L1_Activity_2
{
  public static void main(String[] args)
  {
    
    int[] sum = new int[10];
    
    //h[0] = 1;
    sum[0] = 0;
    //h[1] = h[0] + 2;
    sum[1] = 1;
    //h[2] = h[1] + 3;
    sum[2] = sum[1] + 2;
    //h[3] = h[1] + 4;
    sum[3] = sum[2] + 3;
    //h[4] = h[2] + 5;
    sum[4] = sum[3] + 4;
    //h[5] = h[3] + 6;
    sum[5] = sum[4] + 5;
    //h[6] = h[4] + 7;
    sum[6] = sum[5] + 6;
    //h[7] = h[5] + 8;
    sum[7] = sum[6] + 7;
    //h[8] = h[6] + 9;
    sum[8] = sum[7] + 8;
    //h[9] = h[7] + 10;
    sum[9] = sum[8] + 9;
    
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    if (i >= 0 && i <= 9) 
      //System.out.println(h(i));
      System.out.println(sum[i]);
      
  }
}
