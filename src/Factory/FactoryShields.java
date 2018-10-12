package Factory;

import java.util.ArrayList;

import Items.Shields;


public class FactoryShields {
	
	// code classe helmet X0... pour le crusader
	//					  YO... pour le psycher
	//			  		  W0... pour le hacker
	// apres image rarity / consti / force / dex / mana / luck / armure

private static Shields shieldsX01 = new Shields("bouclier de training", 0, 5, 0);

public static ArrayList<Shields> factoListSwords () {
	
	ArrayList<Shields> listShields = new ArrayList<Shields>();
	listShields.add(shieldsX01);
	return listShields;
}

}
