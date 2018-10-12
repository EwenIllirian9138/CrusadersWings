package Items;

public abstract class ItemsHandsRight extends ItemsHands {
	
	private Integer dammage;
	private Integer criticalChance;
	private Integer dammageCritique;
	
	public ItemsHandsRight(String name, Integer rarity, Integer dammage, Integer criticalChance, Integer dammageCritique) {
		super(name, rarity);
		this.dammage = dammage;
		this.criticalChance = criticalChance;
		this.dammageCritique = dammageCritique;
	}
	public Integer getDammage() {
		return dammage;
	}
	public void setDammage(Integer dammage) {
		this.dammage = dammage;
	}
	public Integer getCriticalChance() {
		return criticalChance;
	}
	public void setCriticalChance(Integer criticalChance) {
		this.criticalChance = criticalChance;
	}
	public Integer getDammageCritique() {
		return dammageCritique;
	}
	public void setDammageCritique(Integer dammageCritique) {
		this.dammageCritique = dammageCritique;
	}

	
	
}