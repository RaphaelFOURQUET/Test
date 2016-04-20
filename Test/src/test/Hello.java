/**
 * package test
 * Better than default package.
 */
package test;

/**
 * @author INTI-0332
 *
 */

//author : Raphael date : 18/04/2016
public class Hello {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		//Auto-generated method stub
		 System.out.print("Hello World !\n");	//RFRF : First print !
		 System.out.println("\tMy name is Raphael.");
		 
		 
		 //Declaration
		 long anneeLumiere; 
		 anneeLumiere = 9_460_700_000_000_000L;	//RFRF : _ can be used without problem, L for long.
		 System.out.println("annee lumiere = "+anneeLumiere);

		 float pi = 3.141592653f;	//RFRF : f for float.
		 System.out.println("pi = "+pi);
		 System.out.println("Math.PI : "+Math.PI);	//RFRF : const PI

		 double division = 0.333333333333333333333333333333333333333333334d;	//RFRF : d not mandatory here, double by default.
		 System.out.println("division = "+division);

		 char car = 65;	//RFRF : ASCII code of A
		 char car2 = 'Z';
		 System.out.println("car is : "+car+" and car2 is : "+car2+" !");
		 
		 char c = 'a';
		 System.out.println("c : "+c);
		 
		 boolean question = true;
		 System.out.println("question : "+question);
		 
		 //Operations
		 int nombre=0, valeur=2;

		 nombre = valeur++ +1;
		 System.out.println("nombre : "+nombre+" valeur : "+valeur);	//RFRF : 3 3, le ++ est réalisé après l'affectation.
		 
		 nombre = 0;
		 valeur = 2;
		 nombre = ++valeur +1;
		 System.out.println("nombre : "+nombre+" valeur : "+valeur);	//RFRF : 4 3, le ++ est réalisé avant l'affectation.
		 
		 //Operateur ternaire
		 int x = 10, y = 20; 
		 int max = (x < y) ? y * 2 : x * 2 ; //Ici, max vaut 2 * 20 donc 40
		 System.out.println("Max : "+max);
		 
		 //Boucles
		 int i,j,k;
		 for(i = 10; i >= 0; i--)  
			 System.out.println("Il reste "+i+" ligne(s) à écrire");

		 while(++i<=10) {
			 //i++;
			 System.out.println("i vaut : "+i);
		 }
		 
		 i--;
		 
		 do {
			 //i--;
			 System.out.println("Il reste "+i+" ligne(s) à écrire");
		 } while(--i>=0);
		 
		 //RFRF : for à deux variables.
		 for(k = 0, j = 2; (k < 10 && j < 6); k++, j+=2) {  
			 System.out.println("k = " + k + ", j = " + j); 
		 }
 
	}

}
