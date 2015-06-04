package ba.BITCamp.ajla.Homework11;

public class Task2 {

	public static void main(String[] args) {
		System.out.println(getGrade(93));
		System.out.println(getGrade(28));
		System.out.println(getGrade(76));
	}

	// getGrade(int) method is receiving number of points and returning grade
	public static char getGrade(int numberOfPoints) {
		
		if(numberOfPoints == 54){
			return 'F';
		}
		numberOfPoints = (numberOfPoints - 4) / 10;
		switch (numberOfPoints) {
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		case 5:
			return 'E';
		default:
			return 'F';
		}
	}
}
