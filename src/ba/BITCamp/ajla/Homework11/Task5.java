package ba.BITCamp.ajla.Homework11;

public class Task5 {

	public static void main(String[] args) {

		System.out.println(getNumbersOnly("41d4 K. :9"));
		System.out.println(getNumbersOnly("22.42o15"));
		System.out.println(getNumbersOnly(":r: (:S"));
		System.out.println(getNumbersOnly(""));

	}
	
	// getNumbersOnly(String) method is receiving String parameter
	// returning reduced string that contains only numbers from original string
	public static String getNumbersOnly(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (ch.isDigit(ch)) {
				res += ch;
			}
		}
		return (res != "") ? res : "0";
	}
}
