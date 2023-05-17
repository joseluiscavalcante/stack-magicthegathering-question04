package application;

import java.util.Locale;

import entities.Card;
import entities.Deck;
import entities.MagicCard.TypeSpellAbility;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Card a = new Card("A", TypeSpellAbility.CREATURE, 10, "aaa");
		Card b = new Card("B", TypeSpellAbility.ENCHANTMENT, 20, "bbb");
		Card c = new Card("C", TypeSpellAbility.INSTANT, 30, "ccc");

		Deck deck = new Deck();
		
		deck.addCard(a);
		deck.addCard(b);
		deck.addCard(c);
		
		deck.popCard(a);
		
		deck.mostar();
	}

}
