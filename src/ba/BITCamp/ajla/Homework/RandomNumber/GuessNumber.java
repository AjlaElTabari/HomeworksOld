package ba.BITCamp.ajla.Homework.RandomNumber;

import java.util.Scanner;

public class GuessNumber {

	// public variables that we need to use int his class and in the main class/method
	public static Scanner input = new Scanner(System.in);
	public static int maxNoOfGuesses = 0;
	public static int winsNo = 0;
	public static int losesNo = 0;
	public static int gamesPlayed = 0;
	
	// setting random number from 0 - 100
	// and calling method to start the game
	public static void playGame(){
		System.out.println("I imagined a random number from 0 to 100");
		System.out.println("Play with me and guess imagined number");
		boolean playMore = true;
		while (playMore) {
			int randomNum = (int)(Math.random() * 100 + 1);
			playGame(randomNum, maxNoOfGuesses);
			playMore = playAgain();
			gamesPlayed++;
		}	
	}	

	// Determines if player wants to play again
	public static boolean playAgain(){
		System.out.println("Do you want to play again? (Type yes or no)");
		String playAgain = input.next();
		return (playAgain.equals("yes")) ? true : false;
	}

	// Asking user to guess number as many times as it is defined with level
	// Checking if user guessed number, and giving a hint if desired number is 
	// larger or smaller then desired number
	public static void playGame(int num, int numOfGuesses) {
		int guess = 0;
		while (numOfGuesses > 0) {
			System.out.println("Guess");			
			guess = input.nextInt();
			if (guess == num){
				System.out.println("Congratulations, you won!");
				System.out.println("Imagined number was " + num + ".");
				winsNo++;
				break;
			}
			isLargerOrSmaller(num, guess);
			numOfGuesses--;
		}
		if(numOfGuesses == 0){
			System.out.println("Sorry :( \nImagined number was " + num + ".");
			losesNo++;
		}
	}

	
	static void isLargerOrSmaller(int num, int guess) {
		if (num > guess) {
			System.out.println("Imagined number is larger.");
		} else {
		System.out.println("Imagined number is smaller.");
		}	
	}
}
