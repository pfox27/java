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
		//String[] cardRanks = new String[52];
		String[] cardSuits1 = {"Hearts", "Spades", "Hearts", "Clubs", "Diamonds"};
		//String[] cardSuits = new String[52];
		int[] cardPointValues1 = {11, 10, 13, 4, 9};
		//int[] cardPointValues = new int[52];
		
		Deck deck1 = new Deck(cardRanks1, cardSuits1, cardPointValues1);
		System.out.println("Deck1 size should be 5: " + deck1.size());
		
		//Deck.size(deck1);
		//Deck.isEmpty(deck1.size());
		
		String[] cardRanks2 = {"Queen", "Ace", "5", "6", "2"};
		String[] cardSuits2 = {"Clubs", "Diamonds", "Hearts", "Clubs", "Spades"};
		int[] cardPointValues2 = {12, 1, 5, 6, 2};
		Deck deck2 = new Deck(cardRanks2, cardSuits2, cardPointValues2);
		System.out.println("Deck2 empty state is: " + deck2.isEmpty());
		//Deck.size(deck2);
		//Deck.isEmpty(deck2.size());
		
		String[] cardRanks3 = {"3", "8", "Jack", "7", "Ace"};
		String[] cardSuits3 = {"Spades", "Spades", "Diamonds", "Hearts", "Clubs"};
		int[] cardPointValues3 = {3, 8, 11, 7, 1};
		Deck deck3 = new Deck(cardRanks3, cardSuits3, cardPointValues3);
		//Deck.size(deck3);
		//Deck.isEmpty(deck2.size());
		System.out.println("Deck3 dealt card is: " + deck3.deal());
		System.out.println("The number of cards left in deck 3 is now: " + deck3.size());
		
	}
}
