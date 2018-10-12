package Factory;

import java.util.ArrayList;

import Spells.SpellsCrusader;
import Spells.SpellsPsycher;

public class FactorySpellsPsycher {
	
	private static SpellsPsycher spellsPsycherV20 = new SpellsPsycher("V20", "soins", 1, 0, 2, "soigne ses alli�s");
	private static SpellsPsycher spellsPsycherV30 = new SpellsPsycher("V30", "attaque psychique", 1, 40, 4, "inflige des d�gats");
	
	public static ArrayList<SpellsPsycher> factoListSpellsCrusader () {
		
		ArrayList<SpellsPsycher> listSpellsCrusader = new ArrayList<SpellsPsycher>();
		listSpellsCrusader.add(spellsPsycherV20);
		listSpellsCrusader.add(spellsPsycherV30);
		return listSpellsCrusader;
	}
}
