package test;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		//Auto-generated method stub

		//Scanner
		 Scanner sc = new Scanner(System.in);	//RFRF : Creation flux entrée.
		 
		 System.out.println("Veuillez saisir un mot :"); 
		 String str1 = sc.nextLine(); 
		 System.out.println("Vous avez saisi : \n\t" + str1);
		 
		 System.out.println("Veuillez saisir un nombre :"); 
		 int str2 = sc.nextInt();	//RFRF : erreur si on entre une chaine de caractères : pas facile à corriger sans gestion d'exceptions.
		 System.out.println("Vous avez saisi le nombre : \n\t" + str2);
		 
		 sc.nextLine();	//RFRF : Flush scanner P37 : Si on veut nextLine() après un nextAutre ...
		 System.out.println("Veuillez saisir un mot :"); 
		 String str3 = sc.nextLine(); 
		 System.out.println("Vous avez saisi : \n\t" + str3);
		 
		 System.out.println("D1 : Veuillez saisir un nombre :"); 
		 double str4 = sc.nextDouble();	//RFRF : erreur si on entre une chaine de caractères : pas facile à corriger sans gestion d'exceptions.
		 System.out.println("Vous avez saisi le nombre : \n\t" + str4);
		 
		 System.out.println("D2 : Veuillez saisir un nombre :"); 
		 double str4b = sc.nextDouble();	//RFRF : erreur si on entre une chaine de caractères : pas facile à corriger sans gestion d'exceptions.
		 System.out.println("Vous avez saisi le nombre : \n\t" + str4b);
		 
		 sc.close();
		
	}

}
