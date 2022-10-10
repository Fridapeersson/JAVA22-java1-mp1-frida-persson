package miniprojek1;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int randomNbr;
		int guess = 0;
		int playerGuess = 0;
		//while loop som forsätter spelet för evigt
		while (true) {
			//Genererar ett nytt random nummer varje runda
			randomNbr = (int) Math.round(Math.random()*100);
//			System.out.println(randomNbr);
			System.out.println("Gissa numret");
			System.out.println("Skriv in ett tal mellan 0-100");
			//do while fortsätter så länge playerGuess != randomNbr
		do {
			playerGuess = scan.nextInt();
			if (playerGuess < randomNbr) {
				System.out.println("Du gissade för lågt. Prova igen");
			}
			else if (playerGuess > randomNbr) {
				System.out.println("Du gissade för högt. Prova igen");
			}
			guess++;
		}while (!nbrCheck(playerGuess, randomNbr));
		
		System.out.println("Snyggt, du gissade rätt! Det tog dig " + guess + " försök innan du gissade rätt :)");
		//Nollställer antalet gissningar för nästa runda
		guess = 0;
		}
}
	//Metod 
	static boolean nbrCheck(int playerGuess, int randomNbr) {
		return playerGuess == randomNbr;
	}
}
