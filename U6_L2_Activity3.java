public class U6_L2_Activity3
{

  // Write your numDivisible method here
	public static int numDivisible(int number, int[] arr)
		{
			int Count = 0;
			for (int i = 0; i < arr.length; i++)
				{
					if ((arr[i]) % number == 0)
						{
							Count++;
						}
				}
					return Count;
		}
}
