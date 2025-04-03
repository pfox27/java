/**
 * This is a class that tests the Deck class.
 */
 
import java.util.Scanner;
 

public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] rank = {"0"};
		String[] suit = {"0"};
		int[] worth = {0};
		
		System.out.println("Enter the number of cards in the deck: ");
		Scanner sc = new Scanner(System.in);
		int cardsTotal = sc.nextInt();
		
		
		for(int i = 0; i < cardsTotal; i++){
			
			System.out.println("Please enter the rank of the next card: ");
			rank[i] = sc.nextLine();
			System.out.println("Please enter the suit of the next card: ");
			suit[i] = sc.nextLine();
			System.out.println("Please enter the value of the next card (as an integer): ");
			worth[i] = sc.nextInt();
		}
		
		Deck dck = new Deck(rank, suit, worth);
		//dck.Deck(rank, suit, worth);
		
		//Deck.Deck(rank, suit, worth);
}
}
