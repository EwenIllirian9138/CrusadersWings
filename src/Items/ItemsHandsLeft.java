package Items;

public abstract class ItemsHandsLeft extends ItemsHands {
	
	private Integer armor;
	private Integer criticalChance;
	private Integer criticalDammage;
		
	public ItemsHandsLeft(String name, Integer rarity, Integer armor, Integer criticalChance) {
		super(name, rarity);
		this.armor = armor;
		this.criticalChance = criticalChance;
	}
	public Integer getArmor() {
		return armor;
	}
	public void setArmor(Integer armor) {
		this.armor = armor;
	}
	public Integer getCriticalChance() {
		return criticalChance;
	}
	public void setCriticalChance(Integer criticalChance) {
		this.criticalChance = criticalChance;
	}
//	public Integer getCriticalDammage() {
//		return criticalDammage;
//	}
//	public void setCriticalDammage(Integer criticalDammage) {
//		this.criticalDammage = criticalDammage;
//	}
}
