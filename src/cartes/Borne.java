package cartes;

public class Borne extends Carte{
	private int km; 
	
	public void Botte(int km) {
		this.km = km; 
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
}
