package Factory;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Items.Swords;

public class FactorySwords {
	
	// code classe helmet X0... pour le crusader
		//					  YO... pour le psycher
		//			  		  W0... pour le hacker
		// apres image rarity / consti / force / dex / mana / luck / armure
	
	private static Swords swordX01 = new Swords("épee de trainning", 0, 5, 0, 2);
	
	public static ArrayList<Swords> factoListSwords () {
		
		ArrayList<Swords> listSwords = new ArrayList<Swords>();
		listSwords.add(swordX01);
		return listSwords;
	}
}
