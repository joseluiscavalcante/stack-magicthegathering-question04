package entities;

import entities.MagicCard.TypeSpellAbility;
import utilities.MyStack;

public class Deck {
	private MyStack <MagicCard> cards; 
	
	public Deck() {
		this.cards = new MyStack<>();
	}
	
	public void addCard(MagicCard c) {
		if(TypeSpellAbility.LAND == c.getType() || TypeSpellAbility.CREATURE == c.getType() || TypeSpellAbility.ENCHANTMENT == c.getType() || TypeSpellAbility.ARTIFACT == c.getType() || TypeSpellAbility.PLANESWALKER == c.getType() || TypeSpellAbility.SORCERY == c.getType()) {
			if(cards.size() == 0) {
				cards.push(c);
			}
		}
		else if(TypeSpellAbility.INSTANT == c.getType() || TypeSpellAbility.ACTIVATED_ABILITY == c.getType() || TypeSpellAbility.TRIGGED_ABILITY == c.getType()) {
			cards.push(c);
		}
		else {
			
		}
	}
	
	public void popCard() {
		cards.pop();
	}
	
	public void popCard(MagicCard card) {
		cards.findRemoveObj(card);
	}
	
	public void mostar() {
		System.out.println(cards);
	}
}
