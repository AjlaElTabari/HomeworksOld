package ba.BITCamp.ajla.Homework.Weekend4.Football;

public class Main {

	public static void main(String[] args) {

		FootballPlayer goalkeeper = new FootballPlayer("Asmir Begovic", 1987,
				"Goalkeeper");
		FootballPlayer defender1 = new FootballPlayer("Emir Spahic", 1980,
				"Defender");
		FootballPlayer defender2 = new FootballPlayer("Sead Kolasinac", 1993,
				"Defender");
		FootballPlayer midlefielder1 = new FootballPlayer("Muhamed Besic",
				1992, "Midfielder");
		FootballPlayer midlefielder2 = new FootballPlayer("Haris Medunjanin",
				1985, "Midfielder");
		FootballPlayer midlefielder3 = new FootballPlayer("Miralem Pjanic",
				1990, "Midfielder");
		FootballPlayer midlefielder4 = new FootballPlayer("Edin Visca", 1990,
				"Midfielder");
		FootballPlayer midlefielder5 = new FootballPlayer("Izet Hajrovic",
				1991, "Midfielder");
		FootballPlayer midlefielder6 = new FootballPlayer("Zvjezdan Misimovic",
				1982, "Midfielder");
		FootballPlayer forward1 = new FootballPlayer("Vedad Ibisevic", 1984,
				"Forward");
		FootballPlayer forward2 = new FootballPlayer("Edin Dzeko", 1987,
				"Forward");
		FootballPlayer[] players = new FootballPlayer[] { goalkeeper,
				defender1, defender2, midlefielder1, midlefielder2,
				midlefielder3, midlefielder4, midlefielder5, midlefielder6,
				forward1, forward2 };
		Team team = new Team("National Football Team of Bosnia and Herzegovina", players);

		// Testing 
		System.out.println(countPlayers(team, 1993) + " player(s) was born in the year you picked.");
		System.out.println(countPlayers(team, "Midfielder") + " player(s) playing on the eposition you picked.");
		System.out.println(getYoungestPlayer(team) + " He is the youngest team member.");

	}

	/** 
	 * Count how many players were born on the forwarded year in the forwarded Team
	 * @param t Team - team to be searched for players 
	 * @param year 
	 * @return number of players in forwarded team, born in forwarded year
	 */
	public static int countPlayers(Team t, int year) {
		int counter = 0;
		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].yearOfBirth == year) {
				counter++;
			}
		}
		return counter;
	}

	/** 
	 * Count how many players are playing on forwarded position in the forwarded Team
	 * @param t Team - team to be searched for players 
	 * @param position 
	 * @return number of players in forwarded team, playing on forwarded position
	 */
	public static int countPlayers(Team t, String position) {
		int counter = 0;
		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].position.equals(position)) {
				counter++;
			}
		}
		return counter;
	}
	/** 
	 * Finds the youngest player in forwarded team
	 * @param t Team - team to be searched for player 
	 * @return Information of youngest team member
	 */
	public static FootballPlayer getYoungestPlayer(Team t){
		
		FootballPlayer youngestPlayer = t.players[0];
		for (int i = 0; i < t.players.length; i++) {
			if (youngestPlayer.yearOfBirth < t.players[i].yearOfBirth) {
				youngestPlayer = t.players[i];
			}
		}
		return youngestPlayer;
	}

}
