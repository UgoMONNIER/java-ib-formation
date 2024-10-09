package exercice6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		try ( Scanner scanner = new Scanner( System.in ) ) {
            System.out.print( "Veuillez saisir le nombre d'éléve : " );
            int numberStudent = scanner.nextInt();
            
            System.out.print( "Veuillez saisir le nombre de notes : " );
            int numbernotes = scanner.nextInt();
            
            int[][] arrayStudentNotes = new int[numberStudent][numbernotes];
            
            for(int i = 0; i< numberStudent; i++) {
                for(int j = 0; j< numbernotes; j++) {
                	Random rand = new Random();
                	int rand_int = rand.nextInt(100);
                	arrayStudentNotes[i][j] = rand_int;
                	System.out.println("Student number : " + (i+1) + " Student note : " + j);
                	System.out.println(rand_int);
                }
            }
            
            int[] arrayAvgNotes = new int[numberStudent];
            for (int i = 0; i < numberStudent; i++) {
            	int sum = 0;
                for (int j = 0; j < numbernotes; j++) {
                    sum += arrayStudentNotes[i][j];
                }
                arrayAvgNotes[i] = sum/numbernotes;
                System.out.println("Moyenne student numero : " + (i+1));
                System.out.println(sum/numbernotes + " sur 100");
            }

            
        }

	}

}
