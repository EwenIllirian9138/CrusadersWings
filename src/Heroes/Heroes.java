package Heroes;

import Items.ArmorBody;
import Items.Helmet;
import Items.ItemsHandsLeft;
import Items.ItemsHandsRight;

public abstract class Heroes {
	
	private Integer id;
	private Integer life;
	private String name;
	private String image;
	private Integer strength;
	private Integer dexterity;
	private Integer mana;
	private Integer constitution;
	private Integer luck;
	private Helmet helmet;
	private ArmorBody armorBody;
	private ItemsHandsRight rightHand;
	private ItemsHandsLeft leftHand;	
	
	public Heroes(Integer id, Integer life, String name, String image, Integer strength, Integer dexterity, Integer mana,
			Integer constitution, Integer luck, Helmet helmet, ArmorBody armorBody, ItemsHandsRight rightHand,
			ItemsHandsLeft leftHand) {
		this.id = id;
		this.life = life;
		this.name = name;
		this.image = image;
		this.strength = strength;
		this.dexterity = dexterity;
		this.mana = mana;
		this.constitution = constitution;
		this.luck = luck;
		this.helmet = helmet;
		this.armorBody = armorBody;
		this.rightHand = rightHand;
		this.leftHand = leftHand;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLife() {
		return life;
	}
	public void setLife(Integer life) {
		this.life = life;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public Integer getConstitution() {
		return constitution;
	}
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	public Integer getLuck() {
		return luck;
	}
	public void setLuck(Integer luck) {
		this.luck = luck;
	}
	public Helmet getHelmet() {
		return helmet;
	}
	public void setHelmet(Helmet helmet) {
		this.helmet = helmet;
	}
	public ArmorBody getArmorBody() {
		return armorBody;
	}
	public void setArmorBody(ArmorBody armorBody) {
		this.armorBody = armorBody;
	}
	public ItemsHandsRight getRightHand() {
		return rightHand;
	}
	public void setRightHand(ItemsHandsRight rightHand) {
		this.rightHand = rightHand;
	}
	public ItemsHandsLeft getLeftHand() {
		return leftHand;
	}
	public void setLeftHand(ItemsHandsLeft leftHand) {
		this.leftHand = leftHand;
	}	
}
