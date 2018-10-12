package Heroes;

import Items.ArmorBody;
import Items.Helmet;
import Items.ItemsHandsLeft;
import Items.ItemsHandsRight;
import Spells.SpellsCrusader;

public class Hacker extends Heroes {
	
	private String className;
	private String Ultimate;
	private SpellsCrusader spellFirst;
	private SpellsCrusader spellTwo;
	
	public Hacker(Integer id, Integer life, String name, String image, Integer strength, Integer dexterity,
			Integer mana, Integer constitution, Integer luck, Helmet helmet, ArmorBody armorBody,
			ItemsHandsRight rightHand, ItemsHandsLeft leftHand, String className, String ultimate,
			SpellsCrusader spellFirst, SpellsCrusader spellTwo) {
		super(id, life, name, image, strength, dexterity, mana, constitution, luck, helmet, armorBody, rightHand,
				leftHand);
		this.className = className;
		Ultimate = ultimate;
		this.spellFirst = spellFirst;
		this.spellTwo = spellTwo;
	}
	     
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getUltimate() {
		return Ultimate;
	}
	public void setUltimate(String ultimate) {
		Ultimate = ultimate;
	}
	public SpellsCrusader getSpellFirst() {
		return spellFirst;
	}
	public void setSpellFirst(SpellsCrusader spellFirst) {
		this.spellFirst = spellFirst;
	}
	public SpellsCrusader getSpellTwo() {
		return spellTwo;
	}
	public void setSpellTwo(SpellsCrusader spellTwo) {
		this.spellTwo = spellTwo;
	}	
}
