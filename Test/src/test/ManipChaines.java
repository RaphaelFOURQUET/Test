package test;

public class ManipChaines {
	public static void main(String[] args) {
		
		 //String
		//Premi�re m�thode de d�claration
		 String phrase; 
		 phrase = "Titi et Grosminet"; 
		 //Deuxi�me m�thode de d�claration
		 String str = new String(); 
		 str = " Une autre cha�ne de caract�res"; 
		 //Troisi�me m�thode de d�claration
		 String string = " Une autre cha�ne"; 
		 //Quatri�me m�thode de d�claration
		 String chaine = new String(" Et une de plus !");
		 
		 System.out.println("String : "+phrase+str+string+chaine); //RFRF : Clear unused warning.

		String str1 = new String("coucou"), str2 = new String("toutou"), str3 = new String("toutou");

		if (str3 == str2)	//== ne permet pas de comparer deux chaines car compare l'adresse memoire et pas le contenu.
			System.out.println("Les deux cha�nes sont identiques !"); 
		else  
			System.out.println("Les deux cha�nes sont diff�rentes !");

		if (str3.equals(str2))  
			System.out.println("Les deux cha�nes sont identiques !"); 
		else  
			System.out.println("Les deux cha�nes sont diff�rentes !");

		if (str1.equals(str2))  
			System.out.println("Les deux cha�nes sont identiques !"); 
		else  
			System.out.println("Les deux cha�nes sont diff�rentes !");
	}

}
