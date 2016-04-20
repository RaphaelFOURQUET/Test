package test;

/**
 * 
 * @author INTI-0332
 *
 * @param <T> parametre generique.
 */
public class Solo<T> {

	//Variable d'instance  
	private T valeur;          
	
	//Constructeur par défaut  
	public Solo(){    
		this.valeur = null;  
	}  
	
	//Constructeur avec paramètre inconnu pour l'instant  
	public Solo(T val){    this.valeur = val;  
	}          
	
	//Définit la valeur avec le paramètre  
	public void setValeur(T val){    
		this.valeur = val;  
	}          
	
	//Retourne la valeur déjà « castée » par la signature de la méthode !  
	public T getValeur(){    
		return this.valeur;  
	}       
	
	
	public static void main(String[] args) {
		//Auto-generated method stub
		
		//RFRF : Il faut utiliser les classes de type primitifs (avec Maj).
		 Solo<Integer> val = new Solo<Integer>(12);  
		 int nbre = val.getValeur(); 
		 System.out.println("nbre : "+nbre);
		 
		 Solo<Double> d = new Solo<Double>(5.2);
		 double nb = d.getValeur();
		 System.out.println("nb : "+nb);
		 
	}

}
