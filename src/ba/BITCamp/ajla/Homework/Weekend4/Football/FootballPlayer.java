package ba.BITCamp.ajla.Homework.Weekend4.Football;

public class FootballPlayer {
	public String name;
	public int yearOfBirth;
	public String position;
	
	/**
	 * @param name
	 * @param yearOfBirth
	 * @param position
	 */
	public FootballPlayer(String name, int yearOfBirth, String position) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}
	
	public String toString(){
		String s = name + " ";
		s += "was born in " + yearOfBirth + ". He is playing on ";
		s += position + " position.";
		return s;
	}

}
