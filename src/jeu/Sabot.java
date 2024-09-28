package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterable<Carte> {
    private Carte[] cartes; // tableau de cartes
    private int nbCartes; // nombre de cartes dans le sabot
    private int capaciteMax; // capacité maximale du sabot
    private int nombreOperation = 0; // pour gérer les modifications concurrentes

    public Sabot(Carte[] cartes) {
        this.cartes = cartes;
        this.nbCartes = cartes.length;
        this.capaciteMax = cartes.length;
    }

    // Méthode pour obtenir les cartes du sabot
    public Carte[] getCartes() {
        return cartes;
    }

    // Méthode pour obtenir le nombre de cartes restantes dans le sabot
    public int getNbCartes() {
        return nbCartes;
    }

    // Vérifier si le sabot est vide
    public boolean estVide() {
        return nbCartes == 0;
    }

    // Ajouter une carte au sabot
    public void ajouterCarte(Carte carte) throws Exception {
        if (nbCartes >= capaciteMax) {
            throw new Exception("Capacité maximale du sabot atteinte.");
        }
        cartes[nbCartes] = carte; // Ajouter la carte à la fin
        nbCartes++; // Incrémenter le nombre de cartes
        nombreOperation++; // Mise à jour du compteur pour gérer les modifications
    }

    // Piocher la première carte du sabot
    public Carte piocher() {
        Iterator<Carte> it = this.iterator();

        // Vérifie s'il y a encore des cartes à piocher
        if (it.hasNext()) {
            Carte premiereCarte = it.next(); // Obtenir la première carte
            it.remove(); // Supprimer la première carte
            return premiereCarte; // Retourner la carte piochée
        } else {
            throw new NoSuchElementException("Le sabot est vide, impossible de piocher.");
        }
    }

    @Override
    public Iterator<Carte> iterator() {
        return new SabotIterator();
    }

   
    private class SabotIterator implements Iterator<Carte> {
        private int indice = 0; 
        private int nombreOperationEsperer = nombreOperation; 
        private boolean nextEffectue = false; 

      
        public boolean hasNext() {
            return indice < nbCartes;
        }

        
        public Carte next() {
            verifConcurence(); 
            if (hasNext()) {
                Carte carte = cartes[indice]; 
                indice++; 
                nextEffectue = true; 
                return carte;
            }
            throw new NoSuchElementException("Plus de cartes dans le sabot.");
        }

      
        public void remove() {
            if (!nextEffectue) {
                throw new IllegalStateException("`next()` doit être appelé avant de pouvoir supprimer.");
            }
            for (int i = indice - 1; i < nbCartes - 1; i++) {
                cartes[i] = cartes[i + 1]; 
            }
            cartes[nbCartes - 1] = null; 
            nbCartes--; 
            indice--; 
            nextEffectue = false; 
            nombreOperation++; 
        }

      
        private void verifConcurence() {
            if (nombreOperationEsperer != nombreOperation) {
                throw new ConcurrentModificationException("Le sabot a été modifié de manière concurrente.");
            }
        }
    }
}
