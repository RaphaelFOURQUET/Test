/**
 * 
 */
package test;

/**
 * @author INTI-0332
 *
 */
public class GestionTableau {

	static void parcourirTableau(String[] tabBis) {
		for(String str : tabBis)
			System.out.println(str);
	}

	static void parcourirTableau(int[] tab) {
		for(int str : tab)
			System.out.println(str);
	}

	static void parcourirTableau(String[][] tab) {
		for(String tab2[] : tab)  {
			for(String str : tab2)
				System.out.println(str);
		}
	}

	static void parcourirTableau(String[][] tab, int i) {
		for(String tab2[] : tab)  {
			for(String str : tab2)
				System.out.println(str);
		}
	}
	
	static String toString(String[] tab) {
		System.out.println("\nMéthode toString() !\n----------");
		String retour = "";
		for(String str : tab)
			retour += str + "\n";
		return retour;
	}


}
