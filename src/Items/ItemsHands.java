package Items;

public abstract class ItemsHands {
	
	private String name;
	private Integer rarity;
	
	public ItemsHands(String name, Integer rarity) {
		this.name = name;
		this.rarity = rarity;
	}

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}