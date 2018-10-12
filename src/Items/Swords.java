package Items;

public class Swords extends ItemsHandsRight {
	
	private String typeOfWeapon = "Sword";
	
	public Swords(String name, Integer rarity, Integer dammage, Integer criticalChance, Integer dammageCritique) {
		super(name, rarity, dammage, criticalChance, dammageCritique);
		// TODO Auto-generated constructor stub
	}

	public String getTypeOfWeapon() {
		return typeOfWeapon;
	}

	public void setTypeOfWeapon(String typeOfWeapon) {
		this.typeOfWeapon = typeOfWeapon;
	}
	
}
