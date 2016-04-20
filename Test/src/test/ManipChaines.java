package test;

public class ManipChaines {
	public static void main(String[] args) {
		
		 //String
		//Première méthode de déclaration
		 String phrase; 
		 phrase = "Titi et Grosminet"; 
		 //Deuxième méthode de déclaration
		 String str = new String(); 
		 str = " Une autre chaîne de caractères"; 
		 //Troisième méthode de déclaration
		 String string = " Une autre chaîne"; 
		 //Quatrième méthode de déclaration
		 String chaine = new String(" Et une de plus !");
		 
		 System.out.println("String : "+phrase+str+string+chaine); //RFRF : Clear unused warning.

		String str1 = new String("coucou"), str2 = new String("toutou"), str3 = new String("toutou");

		if (str3 == str2)	//== ne permet pas de comparer deux chaines car compare l'adresse memoire et pas le contenu.
			System.out.println("Les deux chaînes sont identiques !"); 
		else  
			System.out.println("Les deux chaînes sont différentes !");

		if (str3.equals(str2))  
			System.out.println("Les deux chaînes sont identiques !"); 
		else  
			System.out.println("Les deux chaînes sont différentes !");

		if (str1.equals(str2))  
			System.out.println("Les deux chaînes sont identiques !"); 
		else  
			System.out.println("Les deux chaînes sont différentes !");
	}

}
