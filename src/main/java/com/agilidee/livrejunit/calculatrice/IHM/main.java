package main.java.com.agilidee.livrejunit.calculatrice.IHM;

import main.java.com.agilidee.livrejunit.calculatrice.math.Addition;

public class main {

	public static void main(String[] args) {

	    Addition operation = new Addition();
	    Long resultat = operation.calculer(new Long(6), new Long(3));
	    
	    if (resultat.equals(new Long(9)))
	        System.out.println("Test OK");
	    else
	        System.out.println("Test KO");
	    
	    Character c = operation.lireSymbole();
	    if (c.equals('+'))
	        System.out.println("Test OK");
	    else
	        System.out.println("Test KO");
	    
	}

}
