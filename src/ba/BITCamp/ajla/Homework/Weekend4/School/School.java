package ba.BITCamp.ajla.Homework.Weekend4.School;

public class School {

	public String name;
	public Director director;
	public SchoolClass[] schoolClasses;
	
	/**
	 * @param name
	 * @param director
	 * @param schoolClasses
	 */
	public School(String name, Director director, SchoolClass[] schoolClasses) {
		super();
		this.name = name;
		this.director = director;
		this.schoolClasses = schoolClasses;
	}

	public String toString() {
	return name;
	}

	
}
