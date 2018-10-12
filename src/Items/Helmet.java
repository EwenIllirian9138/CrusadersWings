package Items;

public class Helmet extends ItemsBody {
	
	private Integer constitution;
	private Integer strength;
	private Integer dexterity;
	private Integer luck;
	private Integer armor;
	private Integer mana;
		
	
				
	public Helmet(String id, String name, String image, Integer rarity, Integer constitution, Integer strength,
			Integer dexterity, Integer mana, Integer luck, Integer armor) {
		super(id, name, image, rarity);
		this.constitution = constitution;
		this.strength = strength;
		this.dexterity = dexterity;
		this.mana = mana;
		this.luck = luck;
		this.armor = armor;
	}
	public Integer getConstitution() {
		return constitution;
	}
	public void setConstitution(Integer consitution) {
		this.constitution = consitution;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getMana() {
		return mana;
	}
	public void setMana(Integer mana) {
		this.mana = mana;
	}
	public Integer getLuck() {
		return luck;
	}
	public void setLuck(Integer luck) {
		this.luck = luck;
	}
	public Integer getArmor() {
		return armor;
	}
	public void setArmor(Integer armor) {
		this.armor = armor;
	}
	
	

}