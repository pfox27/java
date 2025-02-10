import java.util.Scanner;

public class runnerU8L1Activity1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int rows = scan.nextInt();
    System.out.println("Enter number of columns:");
    int cols = scan.nextInt();
    int[][] mat = new int[rows][cols];
    System.out.println("Enter values:");
    for(int r = 0; r < rows; r++)
    {
      for(int c = 0; c < cols; c++)
        mat[r][c] = scan.nextInt();
    }
    System.out.println("\nMatrix:");
    for(int[] r : mat)
    {
      for(int n : r)
      {
        System.out.print(n + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Diagonal Sum: " + U8L1Activity1.sumOfDiag(mat));
  }
}

