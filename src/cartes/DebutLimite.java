package cartes;

public class DebutLimite extends Limite{
	@Override
    public String toString() {
	 	return "DebutDeLimite"; 
    }
	@Override 
	public boolean equals(Carte carte) {
		if (carte instanceof DebutLimite dl) return true;
		return false; 
	}
}
