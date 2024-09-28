package testsFonctionnels;
import jeu.Sabot;
import cartes.Borne;
import cartes.Carte;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestSabot {
	public static void main(String[] args) {
        Carte[] cartesDuJeu = {
            new Borne(25), new Borne(25), new Borne(50), new Borne(50),
            new Borne(75), new Borne(75), new Borne(100), new Borne(100),
            new Borne(200)
        };
        
        Sabot sabot = new Sabot(cartesDuJeu);

//         Partie a)
        System.out.println("=== Partie a) : Utilisation de piocher() ===");
        try {
            while (!sabot.estVide()) {
                Carte cartePiochée = sabot.piocher();
                System.out.println("Je pioche " + cartePiochée);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

//        // Partie b)
//        System.out.println("\n=== Partie b) : Utilisation de l'itérateur et remove() ===");
//        try {
//            Iterator<Carte> it = sabot.iterator();
//            while (it.hasNext()) {
//                Carte carte = it.next();
//                System.out.println("Je retire " + carte);
//                it.remove(); // Retirer la carte en utilisant l'itérateur
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("Erreur : " + e.getMessage());
//        }
	}
}