package softwareDevelopement;

public class Player {

	public String name;
	public int goals;
	public String team;
	
	public Player(String name, int goals, String team) {
		this.name = name;
		this.goals = goals;
		this.team = team;
	}
	
	public Player() {
	}
	
	public String getName() {
		return name;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public String getTeam() {
		return team;
	}
}
