package Items;

import Items.Items;

public abstract class ItemsBody extends Items {
	
	private Integer rarity;
	
	public ItemsBody(String id, String name, String image, Integer rarity) {
		super(id, name, image);
		this.rarity = rarity;
	}

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	
}

