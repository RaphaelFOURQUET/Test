package test;

import java.util.Scanner;

public class Tableau {

	public static void main(String[] args) {
		//Auto-generated method stub
		
		int i,j;
		//RFRF : Tableaux
		 int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
		 for(i=0; i<premiersNombres.length; i++) {
			 for(j=0; j<premiersNombres[0].length; j++) {
				 System.out.println("premiersNombres["+i+"]["+j+"] : "+premiersNombres[i][j]);
			 }
		 }
		 

		 char tableauCaractere[] = {'a','b','c','d','e','f','g'};       
		 for(i = 0; i < tableauCaractere.length; i++) {	//RFRF : Taille du tableau avec .length
			 System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableauCaractere[i]);
		 }
		
		char tableauCaractere1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'}; 
		 i = 0; 
		 char reponse = ' ',carac = ' '; 
		 Scanner sc1 = new Scanner(System.in);         
		 do {//Boucle principale  
			 do {//On répète cette boucle tant que l'utilisateur n'a pas rentré une lettre figurant dans le tableau    
				 i = 0;    
				 System.out.println("Rentrez une lettre en minuscule, SVP ");                    
				 carac = sc1.nextLine().charAt(0);    
				 
				 //Boucle de recherche dans le tableau    
				 while(i < tableauCaractere1.length && carac != tableauCaractere1[i])      
					 i++;             
				 //Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cases du tableau     
				 if (i < tableauCaractere1.length)      
					 System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");    
				 else //Sinon      
					 System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");           
			 } while(i >= tableauCaractere1.length);  
			 
			 //Tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau   
			 do{    
				 System.out.println("Voulez-vous essayer à nouveau ? (O/N)");    
				 reponse = sc1.nextLine().charAt(0);  
			 } while(reponse != 'N' && reponse != 'O');      
		 } while (reponse == 'O');                
		 System.out.println("Au revoir !");
		 
		 sc1.close();
		 
		 //RFRF : for each particulierement adapté aux parcours de tableaux pour affichage.
		 System.out.println("For each !");
		 String tab0[] = {"toto", "titi", "tutu", "tete", "tata"}; 
		 for(String str : tab0)  
			 System.out.println(str);

		 System.out.println("For each double entree !");
		 String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}}; 
		 i = 0;
		 j = 0; 
		 for(String sousTab[] : tab) {
			 i = 0;  
			 for(String str : sousTab)  {
				 System.out.println("La valeur de la nouvelle boucle est : " + str);    
				 System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);    
				 i++;  
			 } 
			 j++; 
		 }
		 
		 System.out.println("\nAppel parcourirTableau !\n----------");
		 GestionTableau.parcourirTableau(tab[1]);
		 
		 String s = GestionTableau.toString(tab[1]);
		 System.out.println(s);

	}
	
	//RFRF : exo p66 tableau unidimensionnel de String. -> dans GestionTableau.
	/*public static void parcourirTableau(String tab[]) {
		for(String str : tab)
			System.out.println(str);
	}
	
	public static String toString(String[] tab) {
		System.out.println("\nMéthode toString() !\n----------");
		String retour = "";
		for(String str : tab)
			retour += str + "\n";
		return retour;
	}*/

}
