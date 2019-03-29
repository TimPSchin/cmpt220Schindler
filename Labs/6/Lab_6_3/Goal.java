package softwareDevelopement;

public class Goal {

	public int minute;
	public Player player;
	
	public Goal(int minute, Player player) {
		this.minute = minute;
		this.player = player;
	}
	public Goal() {
		
	}
	
	public int getMinute(){
		return minute;
	}
	
	public String getPlayer() {
		return player.getName();
	}
}
