package utils;

import java.util.List;
import java.util.Random;

public class GestionCartes {
	
	public static <T> void extraire(List<T> cartes) {
		int tailleListe = cartes.size();
		Random rand = new Random(); 
		int randomNumber = rand.nextInt(tailleListe); 
	}
}
