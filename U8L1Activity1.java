public class U8L1Activity1
{

  // Sums the lead diagonal of a table of values, the dimensions of which are user defined.

//public class sumOfDiag{
	
	private static int limit = 0;
	private static int sum = 0;
	
	public static int sumOfDiag(int[][] matrix){

		if (matrix.length > matrix[0].length){
			limit = matrix[0].length;
		}
		else 
			limit = matrix.length;
				for (int r = 0; r < limit; r++)  // Accesses rows
				{			
  					for (int c = 0; c < limit; c++) // Accesses columns
  					{
                                                System.out.println("Sum is currently: " + sum);
						sum = sum + matrix[r][c]; // Adds current matrix entry into sum.
  						}
  			System.out.println(); // Skips to next line
		
                                }  
		return sum;

                                     }
                     }


