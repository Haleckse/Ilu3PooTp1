package testsFonctionnels;

import cartes.Borne;
import cartes.DebutLimite;
import cartes.FinLimite;
import jeu.ZoneDeJeu;

public class TestZoneDeJeu {
	public static void main(String[] args) {
		ZoneDeJeu zdj = new ZoneDeJeu(); 
		
		System.out.println("Deposer carte " + 25);
		zdj.deposer(new Borne(25));
		
		zdj.deposer(new Borne(50));
		System.out.println("Deposer carte " + 50);

		zdj.deposer(new Borne(75));
		System.out.println("Deposer carte " + 75);

		System.out.println("Total des bornes " + zdj.donnerKmParcourus());
		
		zdj.deposer(new DebutLimite());
		System.out.println("Limite :" + zdj.donnerLimitationVitesse());
		
		zdj.deposer(new FinLimite());
		System.out.println("Limite :" + zdj.donnerLimitationVitesse());

    }
}
