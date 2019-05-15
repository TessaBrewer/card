
public class Deck 
{
	private Card[] deck;
	
	public Deck(String[] suits, String[] ranks, int[] pointValues)
	{
		deck = new Card[suits.length * ranks.length];
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = new Card(ranks[i % ranks.length], suits[i / ranks.length], pointValues[i % ranks.length]);
		}
	}
	
	public Card getCard(int i)
	{
		return deck[i];
	}
	
	public int length()
	{
		return deck.length;
	}
}
