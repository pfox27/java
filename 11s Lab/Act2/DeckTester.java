/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] cardRanks = {"Jack", "10", "King", "4", "9"};
		String[] cardSuits = {"Hearts", "Spades", "Hearts", "Clubs", "Diamonds");
		int[] cardPointValues = {11, 10, 13, 4, 9};
		Deck(cardRanks, cardSuits, cardPointValues);
		
	}
}
