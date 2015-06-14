package ba.BITCamp.ajla.Homework.Weekend4.School;

public class Main {

	public static void main(String[] args) {
		// School 1
		SchoolClass sClass1 = new SchoolClass("Prvi 1", 24);
		SchoolClass sClass2 = new SchoolClass("Drugi 1", 26);
		SchoolClass sClass3 = new SchoolClass("Treci 1", 28);
		
		SchoolClass[] schoolClasses1 = new SchoolClass[] {sClass1, sClass2, sClass3};
		Director director1 = new Director("dr. Salko Huskic", 1966);
		School school1 = new School("Hamdija Kresevljakovic", director1, schoolClasses1);
		
		// School 2
		SchoolClass sClass4 = new SchoolClass("Prvi 3", 24);
		SchoolClass sClass5 = new SchoolClass("Drugi 3", 26);
		SchoolClass sClass6 = new SchoolClass("Treci 3", 25);
		SchoolClass sClass7 = new SchoolClass("Cetvrti 3", 27);
		
		Director director2 = new Director("Aida Arnautovic", 1963);
		SchoolClass[] schoolClasses2 = new SchoolClass[]{sClass4, sClass5, sClass6, sClass7};
		School school2 = new School("Druga gimnazija Sarajevo", director2, schoolClasses2);
		School[] schools = new School[]{school1, school2};
		
		//Testing
		System.out.println(getNameOfClassWithMostStudents(school1) + " is the largest class in provided school.");
		System.out.println(getSchoolWithYoungestDirector(schools) + "is the school with youngest director.");
		System.out.println(getNameOfSchoolWithMoreStudents(school1, school2) + " is the largest school.");
		
	}
	
	/**
	 * Finding the largest class in provided school
	 * @param s School
	 * @return name of the largest class
	 */
	public static String getNameOfClassWithMostStudents(School s) {
		String theLargestClass = s.schoolClasses[0].title;
		int theMostStudents = s.schoolClasses[0].numberOfStudents;
		for (int i = 0; i < s.schoolClasses.length; i++) {
			if (theMostStudents < s.schoolClasses[i].numberOfStudents) {
				theMostStudents = s.schoolClasses[i].numberOfStudents;
				theLargestClass = s.schoolClasses[i].title;
			}
		}
		return theLargestClass;
	}

	/**
	 * Finding the school with youngest director
	 * @param schools array 
	 * @return name of the school with youngest director
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {
		School schoolWithYoungestDirector = schools[0];
		int yofTemp = schools[0].director.yearOfBirth;
		for (int i = 0; i < schools.length; i++) {
			if (yofTemp < schools[i].director.yearOfBirth) {
				yofTemp = schools[i].director.yearOfBirth;
				schoolWithYoungestDirector = schools[i];
			}
		}
		return schoolWithYoungestDirector;
	}

	/**
	 * Finding the largest school
	 * @param s1 School
	 * @param s2 School
	 * @return name of the largest school
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		int numOfStudents1 = 0, numOfStudents2 = 0;
		for (int i = 0; i < s1.schoolClasses.length; i++) {
			numOfStudents1 += s1.schoolClasses[i].numberOfStudents;
		}
		for (int i = 0; i < s2.schoolClasses.length; i++) {
			numOfStudents2 += s2.schoolClasses[i].numberOfStudents;
		}
		return (numOfStudents1 > numOfStudents2) ? s1.name : s2.name;
	}

}
