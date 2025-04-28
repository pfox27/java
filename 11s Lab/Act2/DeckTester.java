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
		
		String[] cardRanks1 = {"Jack", "10", "King", "4", "9"};
		String[] cardSuits1 = {"Hearts", "Spades", "Hearts", "Clubs", "Diamonds"};
		int[] cardPointValues1 = {11, 10, 13, 4, 9};
		Deck deck1 = new Deck(cardRanks1, cardSuits1, cardPointValues1);
		Deck.size(deck1);
		Deck.isEmpty(deck1.size());
		
		String[] cardRanks2 = {"Queen", "Ace", "5", "6", "2"};
		String[] cardSuits2 = {"Clubs", "Diamonds", "Hearts", "Clubs", "Spades"};
		int[] cardPointValues2 = {12, 1, 5, 6, 2};
		Deck deck2 = Deck(cardRanks2, cardSuits2, cardPointValues2);
		Deck.size(deck2);
		Deck.isEmpty(deck2.size());
		
		String[] cardRanks3 = {"3", "8", "Jack", "7", "Ace"};
		String[] cardSuits3 = {"Spades", "Spades", "Diamonds", "Hearts", "Clubs"};
		int[] cardPointValues3 = {3, 8, 11, 7, 1};
		Deck deck2 = Deck(cardRanks3, cardSuits3, cardPointValues3);
		Deck.size(deck3);
		Deck.isEmpty(deck2.size());
		
	}
}
