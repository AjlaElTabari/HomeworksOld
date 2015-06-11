package ba.BITCamp.ajla.Homework.ZadacaIzParametara;

public class ZadacaIzParametara {

	public static void main(String[] args) {
		System.out.println(getSquare(3));
		System.out.println(getSquare(3.0));
		System.out.println(getProduct(5, 4));
		System.out.println(getProduct(5.0, 4.0));

	}

	public static int getSquare(int num) {
		return (int)Math.pow(num, 2);
	}
	
	public static double getSquare(double num) {
		return Math.pow(num, 2);
	}
	
	public static int getProduct(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double getProduct(double num1, double num2) {
		return num1 * num2;
	}
}
