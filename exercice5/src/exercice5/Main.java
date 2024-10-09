package exercice5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    ArrayList<String> tentatives = new ArrayList<String>();
	    String mot_de_passe = new String();
	    mot_de_passe = "mot_de_passe";
        System.out.print( "Insérer le mot de passe : " );
		try ( Scanner scanner = new Scanner( System.in ) ) {
			String tentative = new String();
			do{
				tentative = scanner.next();
				tentatives.add(tentative);
				System.out.print( "Insérer le mot de passe : " );
			}while( !(mot_de_passe.equals(tentative)) );
            System.out.print( "Felicitation mot de passe trouvé !" );
            System.out.println(tentatives);
        }	
	}
}
