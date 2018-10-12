package Factory;

import java.util.ArrayList;

import Spells.SpellsCrusader;

public class FactorySpellsCrusader {
	
	private static SpellsCrusader spellsCrusaderT20 = new SpellsCrusader("T20", "shatter", 1, 10, 2, "�tourdissement");
	private static SpellsCrusader spellsCrusaderT30 = new SpellsCrusader("T30", "charge", 1, 20, 3, "charge un ennemi en lui faisant des d�gats");

	public static ArrayList<SpellsCrusader> factoListSpellsCrusader () {
		
		ArrayList<SpellsCrusader> listSpellsCrusader = new ArrayList<SpellsCrusader>();
		listSpellsCrusader.add(spellsCrusaderT20);
		listSpellsCrusader.add(spellsCrusaderT30);
		
		return listSpellsCrusader;
	}	
}
