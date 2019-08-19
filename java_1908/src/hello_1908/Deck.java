package hello_1908;

import java.util.ArrayList;
import java.util.List;
public class Deck {
	
	private static Suit suit;
	private static Rank rank;
	private static List<Card> protoDeck= new ArrayList<Card>();
	static {
		for (Suit s:Suit.values())
			{
			for(Rank r:Rank.values()) {
				protoDeck.add(new Card(s,r));

			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println(protoDeck);
	}
	
}
