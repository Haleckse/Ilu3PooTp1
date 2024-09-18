package cartes;

public class Main {
	
	
	public static void main(String[] args) {
		Carte maCarte = new Borne(25); 
		System.out.println(maCarte.toString());
		
		Carte maCarte1 = new Parade(Type.FEU); 
		System.out.println(maCarte1.toString());
		
		JeuDeCartes monJeu = new JeuDeCartes(); 
		monJeu.affichageJeuCarte(); 
	}
}	
