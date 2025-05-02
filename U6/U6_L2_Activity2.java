public class U6_L2_Activity2
{

  // Write your numDivisibleBy3 method here

public static int numDivisibleBy3(int[] arr)
{
int Count = 0;
for (int i = 0; i < arr.length; i++)
{
  if ((arr[i]) % 3 == 0)
  {
    Count++;
  }
}
return Count;
}

}

