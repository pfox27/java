public class U6_L3_Activity3
{
	public static void printUn(String[] words) {
  // Write your printUn method here

		for(int i = 0; i < words.length; i++){
			   if (words[i].length() < 2) {
						continue; }
					else {
						/* if ((words[i].charAt[0] + words[i].charAt[1]) == "un" || 
						(words[i].charAt[0] + words[i].charAt[1]) == "Un" ||
						(words[i].charAt[0] + words[i].charAt[1]) == "uN" ||
						(words[i].charAt[0] + words[i].charAt[1]) == "UN") {
							System.out.println(words[i]); */
							if ((words[i].charAt(0) == 'u' && words[i].charAt(1) == 'n') ||
							 (words[i].charAt(0) == 'U' && words[i].charAt(1) == 'n') ||
							 (words[i].charAt(0) == 'u' && words[i].charAt(1) == 'N') ||
							 (words[i].charAt(0) == 'U' && words[i].charAt(1) == 'N')
							 ) {
								 System.out.println(words[i]); 
							 }
						}
				}		 
			}
	}
