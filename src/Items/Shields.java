package Items;

public class Shields extends ItemsHandsLeft {
	
	private String typeOfWeapon;
	
	public Shields(String name, Integer rarity, Integer armor, Integer criticalChance) {
		super(name, rarity, armor, criticalChance);
		// TODO Auto-generated constructor stub
	}
	
	public String getTypeOfWeapon() {
		return typeOfWeapon;
	}

	public void setTypeOfWeapon(String typeOfWeapon) {
		this.typeOfWeapon = typeOfWeapon;
	}
}
