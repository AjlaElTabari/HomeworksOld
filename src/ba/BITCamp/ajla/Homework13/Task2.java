package ba.BITCamp.ajla.Homework13;

public class Task2 {

	public static void main(String[] args) {
		try {
			int temp = 0;
			for (String str : args) {
				int strInt = Integer.parseInt(str);
				if (strInt > temp) {
					temp = strInt;
				}
			}
			System.out.println("The largest number of provided arguments is " + temp);
		} catch (NumberFormatException e) {
			System.out.println("Wrong input");
		}

	}

}
