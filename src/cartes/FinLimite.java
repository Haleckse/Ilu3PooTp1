package cartes;

public class FinLimite extends Limite{
	@Override
    public String toString() {
	 	return "FinDeLimite"; 
    }
	
	@Override 
	public boolean equals(Carte carte) {
		if (carte instanceof FinLimite fl) return true;
		return false; 
	}
}
