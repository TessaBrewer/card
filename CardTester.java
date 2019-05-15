/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("King", "Spades", 10);
		Card card2 = new Card("Seven", "Clubs", 8);
		Card card3 = new Card("Seven", "Clubs", 7);
		
		System.out.println(card3.toString());
		System.out.println(card2.matches(card3));
		System.out.println(card1.rank() + card1.suit()+ card1.pointValue());
	}
}
