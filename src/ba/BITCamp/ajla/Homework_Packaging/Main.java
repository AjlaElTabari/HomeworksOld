package ba.BITCamp.ajla.Homework_Packaging;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Prilikom pokretanja programa procitati sve argumente date s komandne
		 * linije i protumaciti ih kao decimalne brojeve (`float`). Na ekran
		 * ispisati svaki decimalni broj formatiran koristeci `sprintf()`
		 * metodu, te format string za floating point brojeve. Izracunati
		 * proizvod svih zadatih brojeva i ispisati ga na ekranu, formatiran na
		 * isti nacin. Ako jedan od argumenata nije ispravan decimalni broj,
		 * prikazati poruku o gresci. Prekinuti citanje ako korisnik ne unese
		 * broj (prazan string) ili unese nulu.
		 * 
		 * Napomena: decimalni brojevi pri unosu trebaju biti razdvojeni
		 * decimalnom tackom, a ne zarezom.
		 */

		float product = 1;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Input number: ");
			String arg = input.nextLine();

			// stop the loop if a line is empty
			if (arg.equals("")) {
				break;
			}

			float number = Float.parseFloat(arg);

			System.out.println(number);

			product *= number;
		}

		System.out.printf("Product of received numbers is: %.2f\n", product);

		input.close();
	}

}
