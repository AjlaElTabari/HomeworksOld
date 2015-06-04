package ba.BITCamp.ajla.Homework11;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println(getMax(-12, 47));
		System.out.println(getMax(-5, 7, -9));
	}

	// getMax(int, int) method is receiving two int parameter and returning larger of them
	public static int getMax(int num1, int num2) {
		int max = (num1 >= num2) ? num1 : num2;
		return max;
	}
	
	// getMax(int, int, int) method is receiving three int parameter and returning the largest one using getMax(int, int) method
	public static int getMax(int num1, int num2, int num3) {
		int maxTemp = getMax(num1, num2);
		int max = (maxTemp >= num3) ? maxTemp : num3;
		return max;
	}
}
