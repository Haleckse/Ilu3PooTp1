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
        	return "Essence"; 
        
        case CREVAISON:
        	return "RoueDeSecour"; 
        
        
        case ACCIDENT: 
        	return "Reparation"; 
        
        default:
        	return "unknowCard"; 
        }
    }
}
