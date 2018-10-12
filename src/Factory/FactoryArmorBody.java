package Factory;

import java.util.ArrayList;

import Items.ArmorBody;

public class FactoryArmorBody {

		// code classe helmet X0... pour le crusader
		//					  YO... pour le psycher
		//			  		  W0... pour le hacker
		// apres image rarity / consti / force / dex / mana / luck / armure
	
	private static ArmorBody armorBodyX01 = new ArmorBody("X01", "cote de maille", "image", 0, 2, 1, -1, 0, 0, 2);
	private static ArmorBody armorBodyY01 = new ArmorBody("Y01", "gilet en cuir", "image", 0, 1, 1, 2, 0, 1, 1);
	private static ArmorBody armorBodyW01 = new ArmorBody("W01", "robe d'apprenti", "image", 0, 1, 0, 0, 4, 1, 0);
	
	public static ArrayList<ArmorBody> factoListArmorsBody () {
		
		ArrayList<ArmorBody> listArmorsBody = new ArrayList<ArmorBody>();
		listArmorsBody.add(armorBodyX01);
		listArmorsBody.add(armorBodyY01);
		listArmorsBody.add(armorBodyW01);
		
		return listArmorsBody;
	}
	
}
