
public class Deck 
{
	private Card[] deck;
	
	public Deck(String[] ranks, String[] suits, int[] pointValues)
	{
		deck = new Card[suits.length * ranks.length];
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = new Card(ranks[i % suits.length], suits[i % ranks.length], pointValues[i % suits.length]);
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
