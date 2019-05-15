
public class DeckTester 
{
	public static void main(String [] args)
	{
		String [] suits = {"hearts", "spades", "diamonds"};
		String [] ranks = {"1", "2", "3", "4", "King"};
		int [] pointValues = {1, 2, 3, 4, 5};
		Deck myDeck = new Deck(suits, ranks, pointValues);
		for(int i = 0; i < myDeck.length(); i++)
			System.out.println(myDeck.getCard(i));
	}
}
