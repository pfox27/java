public class U6_L2_Activity1
{

  // Write your containsNeg method here

public static int containsNeg(double[] arr)
{
int negCount = 0;
for (int i = 0; i < arr.length; i++)
{
  if (arr[i] < 0)
  {
    negCount++;
  }
}
return negCount;
}

}
