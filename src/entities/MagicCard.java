package entities;

public abstract class MagicCard {
	public enum TypeSpellAbility {
		LAND,
		CREATURE,
		ENCHANTMENT,
		ARTIFACT,
		PLANESWALKER,
		SORCERY,
		INSTANT,
		ACTIVATED_ABILITY,
		TRIGGED_ABILITY
	}
	private String name;
	private TypeSpellAbility type;
	private int cost;
	private String effect;
	
	public MagicCard(String name, TypeSpellAbility type, int cost, String effect) {
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.effect = effect;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeSpellAbility getType() {
		return type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return "Card name: " + name + ", Type: " + type + ", Cost: " + cost + ", Effect: " + effect;
	}
	
	
	
}
