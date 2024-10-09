package exercice7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> nombreDivisible = new ArrayList<Integer>();
		try ( Scanner scanner = new Scanner( System.in ) ) {
	        System.out.print( "Veuillez saisir un premier entier : " );
	        int a = scanner.nextInt();
	        
	        for(int i=(a-1); i > 0; i--) {
	        	if(a%i == 0){
	        		nombreDivisible.add(i);
	        	}
	        }
	        
	        int sum = 0;
            for(int i = 0; i < nombreDivisible.size(); i++ )
            {
            	sum += nombreDivisible.get(i);
            }
            
            if(sum == a) {
            	System.out.println(a + " est bien un nombre divisible");
            }
	    }
	}
}