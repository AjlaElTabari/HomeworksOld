package ba.BITCamp.ajla.Homework.RandomNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("There are several levels of the game available.");
		System.out
				.println("Levels are graded from 5 to 12. 12 is the lightest one, and 5 is the hardest one.");
		System.out
				.println("What level do you want to play? Enter the number 5 - 12.");
		GuessNumber.maxNoOfGuesses = input.nextInt();
		GuessNumber.playGame();
		//GuessNumber.printScore();

		System.out.println("You have played " + GuessNumber.gamesPlayed
				+ " games.\nYou won:   " + GuessNumber.winsNo
				+ " games.\nYou lost:  " + GuessNumber.losesNo + " games.");

		input.close();
	}

}
