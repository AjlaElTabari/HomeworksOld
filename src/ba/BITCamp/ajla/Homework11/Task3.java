package ba.BITCamp.ajla.Homework11;

public class Task3 {

	public static void main(String[] args) {

		System.out.println(hasNumbers("P4rametri"));
		System.out.println(hasNumbers("substring"));
		System.out.println(hasNumbers("index0f"));
		System.out.println(hasNumbers("1"));
		System.out.println(hasNumbers(""));

	}

	// hasNumbers(String) method is receiving a string, 
	// and returning true if there is numbers contained 
	// in that string, or false otherwise
	public static boolean hasNumbers(String a) {
		for (int i = 0; i < a.length(); i++) {
			Character ch = a.charAt(i);
			if (ch.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
}
