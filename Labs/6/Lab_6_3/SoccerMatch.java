package softwareDevelopement;
import java.util.Date;
public class SoccerMatch {

	public Date startTime;
	public Date endTime;
	public String location;
	public String home;
	public String visitor;
	public Player[] homePlayers = new Player[11];
	public Player[] visitorPlayers = new Player[11];
	public Goal[] homeGoals = new Goal[10];
	public Goal[] visitorGoals = new Goal[10];
	//Set numbers to help form list
	int nmbrHomeGoal = 0;
	int nmbrAwayGoal = 0;
	int nmbrHomePlyr = 0;
	int nmbrAwayPlyr = 0;
	
	public SoccerMatch() {
		this.startTime = new Date();
	}
	
	
	// I need to at the start time and the end time
	
	public SoccerMatch(String location, String home, String visitor) {
		this.startTime = new Date();
		this.location = location;
		this.home = home;
		this.visitor = visitor;
	}
	
	public void endDate() {
		this.endTime = new Date();
	}
	
	public void addHomePlayer(Player p) {
		homePlayers[nmbrHomePlyr] = p;
		nmbrHomePlyr++;
	}
	
	public void addVisitorPlayer(Player p) {
		visitorPlayers[nmbrAwayPlyr] = p;
		nmbrAwayPlyr++;
	}
	
	public String getWinner() {
		if(nmbrHomeGoal == nmbrAwayGoal) {
			return("It is a tie");
		}else if(nmbrHomeGoal < nmbrAwayGoal) {
			return(visitor);
		}
		return(home);
	}
	
	public void addHomeGoal(Goal g){
		homeGoals[nmbrHomeGoal] = g;
		nmbrHomeGoal++;
	}
	
	public void addVisitorGoal(Goal g) {
		visitorGoals[nmbrAwayGoal] = g;
		nmbrAwayGoal++;
	}
	
	//list of goals
	public void getHomeGoals() {
		for(int i = 0; i < nmbrHomeGoal; i++) {
			System.out.println("Home Goal " + (i+1) + " was scored by " + homeGoals[i].getPlayer());
		}
	}
	
	public void getVisitorGoals() {
		for(int i = 0; i < nmbrAwayGoal; i++) {
			System.out.println("Away Goal " + (i+1) + " was scored by " + visitorGoals[i].getPlayer());
		}
	}
}
