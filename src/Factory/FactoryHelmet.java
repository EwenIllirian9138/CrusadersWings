package Factory;

import java.util.ArrayList;

import Items.Helmet;

public class FactoryHelmet {
	
	// code classe helmet X0... pour le crusader
	//					  YO... pour le psycher
	//			  		  W0... pour le hacker
	// apres image rarity / consti / force / dex / mana / luck / armure
	
	private static Helmet helmetX01 = new Helmet("X01", "heaume d'entrainement", "image", 0, 1, 1, 0, 0, 0 ,2);
	private static Helmet helmetYO = new Helmet("YO1", "capuche de cuir", "image", 0, 1 ,0 ,1 ,0 , 0, 1);
	private static Helmet helmetWO = new Helmet("WO1", "petite hood de mage", "image", 0, 0, 0, 0, 2, 0, 1);

	public static ArrayList<Helmet> factoListHelmets () {
		
		ArrayList<Helmet> listHelmets = new ArrayList<Helmet>();
		listHelmets.add(helmetX01);
		listHelmets.add(helmetYO);
		listHelmets.add(helmetWO);
		
		return listHelmets;
		
	}
}

