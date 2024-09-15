package cartes;

public class Botte extends Probleme{

	public Botte(Type type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	 @Override
	    public String toString() {
		 	Type type = super.getType(); 
	        switch (type) {
	        
	        case FEU: 
	        	return "VehiculePrioritaire"; 
	        	
	        case ESSENCE:
	        	return "CiterneEssence"; 
	        
	        case CREVAISON:
	        	return "Increvavcble"; 
	        
	        
	        case ACCIDENT: 
	        	return "AsDuVolant"; 
	        
	        default:
	        	return "unknowCard"; 
	        }
	    }
	
}
