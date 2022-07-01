/*
* Class: CMSC203
* Instructor: Gary Thai
* Description: Generates random number and asks user to guess
* Due: 10/8/2021
* Platform/compiler: Eclipse IDE
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Jonas da Silva
*/
import java.util.*;




public class RandomNumberGuesser {

			
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		RNG RNG = new RNG();
		String flag =  "Yes";
				
		while(flag.equalsIgnoreCase("yes")) {
			int randNum = RNG.rand();
			int guessCount = 1;
			int lowGuess = 0;
			int highGuess = 100;
			int numberGuessed;
			//System.out.println(randNum);
			System.out.println("Enter your first guess: ");
			numberGuessed = Integer.parseInt(keyboard.nextLine());
			boolean isValid = RNG.inputValidation(numberGuessed, lowGuess, highGuess);			
			while (isValid == false){
				System.out.println("Enter your first guess: ");
				numberGuessed = Integer.parseInt(keyboard.nextLine());
				isValid = RNG.inputValidation(numberGuessed, lowGuess, highGuess);			
			}
			System.out.println("Number of guesses is " + guessCount);
			guessCount += 1;
			if (numberGuessed < randNum) {
				System.out.println("Your guess is too low");
				lowGuess = numberGuessed;
			}
			if (numberGuessed > randNum) {
				System.out.println("Your guess is too high");
				highGuess = numberGuessed;
			}
			while (numberGuessed != randNum) {
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				numberGuessed = Integer.parseInt(keyboard.nextLine());
				isValid = RNG.inputValidation(numberGuessed, lowGuess, highGuess);			
				while (isValid == false){
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					numberGuessed = Integer.parseInt(keyboard.nextLine());
					isValid = RNG.inputValidation(numberGuessed, lowGuess, highGuess);			
				}
				System.out.println("Number of guesses is " + guessCount);
				guessCount += 1;
				if (numberGuessed < randNum) {
					System.out.println("Your guess is too low");
					lowGuess = numberGuessed;
				}
				if (numberGuessed > randNum) {
					System.out.println("Your guess is too high");
					highGuess = numberGuessed;
				}
				guessCount += 1;
				
			}
			
			System.out.println("Congratulations! you guessed correctly");
			System.out.println("Try again? (yes or no) ");
			flag = keyboard.nextLine();
			while (!flag.equalsIgnoreCase("yes") && !flag.equalsIgnoreCase("no")) {
				System.out.println("Try again? (yes or no) ");
				flag = keyboard.nextLine();
			}
			
		}

		System.out.println("Thanks for playing...");
		System.out.println("Name: Jonas da Silva");
	}

}
