package first_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbersRandom = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		try ( Scanner scanner = new Scanner( System.in ) ) {
            System.out.print( "Veuillez saisir un premier entier : " );
            int a = scanner.nextInt();
            for(int i = 0; i< a; i++) {
            	Random rand = new Random();
            	int rand_int = rand.nextInt(a);
            	numbersRandom.add(rand_int);
            }
            int sum = 0;
            for(int i = 0; i < numbersRandom.size(); i++ )
            {
            	sum += numbersRandom.get(i);
            }
            sums.add(sum);
            
            System.out.println(sums);
            System.out.println(numbersRandom); 
        }	
	}
}
