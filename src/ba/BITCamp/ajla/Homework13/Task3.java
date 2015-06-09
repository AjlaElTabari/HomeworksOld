package ba.BITCamp.ajla.Homework13;

public class Task3 {

	public static void main(String[] args) {
		int counter = 0;
		
		try {
			if (args.length > 1) {
			throw new ArrayIndexOutOfBoundsException("Please pass only one String to the program.");
			}
			for(int i = 0; i < args[0].length(); i++) {
				if (Character.isDigit(args[0].charAt(i))) {
					counter++;
				}
			}
			
			if (counter == 0) {
				System.out.println(args[0] + " does not contain any numbers");
			} else {
				System.out.println(args[0] + " contains " + counter + " numbers");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass one String to the program.");
		}


		
	}

}
