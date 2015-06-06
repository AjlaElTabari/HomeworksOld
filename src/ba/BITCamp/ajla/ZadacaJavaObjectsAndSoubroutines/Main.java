package ba.BITCamp.ajla.ZadacaJavaObjectsAndSoubroutines;

public class Main {

	public static void main(String[] args) {
		
		Animal kitten = new Animal("Kitten");
		kitten.setSound("myao myaoo myaooo");
		System.out.println("\n" + kitten);
		
		Animal bird = new Animal("Bird");
		bird.setSound("tweet tweet tweet");
		System.out.println("\n" + bird);
		
		Animal owl = new Animal("Owl");
		bird.setSound("hu hu huuu");
		System.out.println("\n" + owl);
		

	}

}
