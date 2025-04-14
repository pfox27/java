/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card card1 = new Card("Jack", "Hearts", 11);
		Card card2 = new Card("Queen", "Spades", 12);
		//card1.toString();
		System.out.println("Card 1: " + card1.toString());
		//card2.toString();
		System.out.println("Card 2: " + card2.toString());
		System.out.println("Cards match? - " + card1.matches(card2));
		
	}
}

