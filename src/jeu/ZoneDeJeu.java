package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cartes.*;

public class ZoneDeJeu {

	private List<Limite> pileLimite = new ArrayList<>();
	private List<Bataille> pileBataille = new ArrayList<>();
	private List<Borne> bornes = new ArrayList<>();
	
//	private Stack<Limite> pileLimite = new Stack<Limite>(); 
//	private Stack<Bataille> pileBataille = new Stack<Bataille>(); 
	
	
	public int donnerLimitationVitesse() {
		if (pileLimite.isEmpty() || (pileLimite.get(0) instanceof FinLimite)) return 200; 
		else return 50; 
	}
	
	public int donnerKmParcourus() {
		int somme = 0; 
		for (Borne borne : bornes) {
		     somme += borne.getKm();
		}
		return somme;
	}
	
	public void deposer(Carte c) {

		if (c instanceof Borne b) bornes.add(0, b); 
		else if (c instanceof Limite l)	pileLimite.add(0, l); 
		else if (c instanceof Bataille ba)	pileBataille.add(0, ba);
	}
	

}

