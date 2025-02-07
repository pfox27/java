public class U8_L1_Activity_1
{

  // Sums the lead diagonal of a table of values, the dimensions of which are user defined.

public class sumOfDiag{
	
	private int limit = 0;
	private int sum = 0;
	
	public sumOfDiag(int[] matrix){

		if matrix.length > matrix[0].length{
			limit = matrix[0].length;
		}
		else 
			limit = matrix.length;
				for (int r = 0; r < limit; r++)  // Accesses rows
				{			
  					for (int c = 0; c < limit; c++) // Accesses columns
  					{
    						System.out.print(grid[r][c] + " \t"); // Prints elements on same line
  						}
  			System.out.println(); // Skips to next line
}






}
