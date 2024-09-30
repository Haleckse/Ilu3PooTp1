package cartes;

public class Parade extends Bataille{

	public Parade(Type type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	

	@Override
    public String toString() {
	 	Type type = super.getType(); 
        switch (type) {
        
        case FEU: 
        	return "FeuVert"; 
        	
        case ESSENCE:
        	return "BidonEssence"; 
        
        case CREVAISON:
        	return "RoueDeSecours"; 
        
        
        case ACCIDENT: 
        	return "Reparation"; 
        
        default:
        	return "unknowCard"; 
        }
    }
	
	@Override 
	public boolean equals(Carte carte) {
		if (carte instanceof Bataille bataille) return type.equals(bataille.getType());
		return false; 
	}
}
