package cartes;

public class Borne extends Carte{
	private int km; 

	
	public Borne(int km) {
		super();
		this.km = km;
	}

	public void Botte(int km) {
		this.km = km; 
	}

	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	 @Override
	    public String toString() {
	        return km + "KM";
	    }
	 @Override
	 public boolean equals(Carte carte) {
			if (carte instanceof Borne borne) return (km == borne.getKm());
			return false; 
		}
}
