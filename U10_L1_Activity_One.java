public class U10_L1_Activity_One
{

  public static void printUpToEnd(int n, int count)
  {
    //System.out.print(n + " ");
    
    if ((n != 0) && (count <= n))
    {
	  System.out.println(count);
	  count++;
      printUpToEnd(n, count);
    }
  }

}

