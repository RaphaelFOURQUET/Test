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
	
	//Constructeur par d�faut  
	public Solo(){    
		this.valeur = null;  
	}  
	
	//Constructeur avec param�tre inconnu pour l'instant  
	public Solo(T val){    this.valeur = val;  
	}          
	
	//D�finit la valeur avec le param�tre  
	public void setValeur(T val){    
		this.valeur = val;  
	}          
	
	//Retourne la valeur d�j� � cast�e � par la signature de la m�thode !  
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
