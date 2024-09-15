package cartes;

public class Attaque extends Bataille{

	public Attaque(Type type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String toString() {
	 	Type type = super.getType(); 
        switch (type) {
        
        case FEU: 
        	return "FeuRouge"; 
        	
        case ESSENCE:
        	return "PanneEssence"; 
        
        case CREVAISON:
        	return "Crevaison"; 
        
        
        case ACCIDENT: 
        	return "Accident"; 
        
        default:
        	return "unknowCard"; 
        }
    }

}


