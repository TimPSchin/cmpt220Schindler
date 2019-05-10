
public class Player {

	public Rank rank;
	public String name;
	public int SR;
	
	public Player() {}
	
	public Player(String name, int SR) {
		this.name = name;
		this.SR = SR;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSR() {
		return SR;
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public void setSR(int sR) {
		if(getSR() + SR <= 0) {
		SR = 0;	
		}else {
		SR = getSR() + sR;
		}
	}
	
	public void getNewSR(Performance performance) {
		int netPoints = 0;
		if(performance.getWin() == true) {
			netPoints = 20;
			if(performance.getKills() > getRank().getAvgKills()) {
				netPoints++;
			}
			if(performance.getDeaths() < getRank().getAvgDeath()) {
				netPoints++;
			}
			if(performance.getObjKills() > getRank().getAvgObjKills()) {
				netPoints++;
			}
			if(performance.getDamage() > getRank().getAvgDamage()) {
				netPoints++;
			}
			if(performance.getObjTime() > getRank().getAvgObjTime()) {
				netPoints++;
			}
			if(performance.getHealing() > getRank().getAvgHeal()) {
				netPoints++;
			}
		}else if(performance.getWin() == false) {
			netPoints = -25;
			if(performance.getKills() > getRank().getAvgKills()) {
				netPoints++;
			}
			if(performance.getDeaths() < getRank().getAvgDeath()) {
				netPoints++;
			}
			if(performance.getObjKills() > getRank().getAvgObjKills()) {
				netPoints++;
			}
			if(performance.getDamage() > getRank().getAvgDamage()) {
				netPoints++;
			}
			if(performance.getObjTime() > getRank().getAvgObjTime()) {
				netPoints++;
			}
			if(performance.getHealing() > getRank().getAvgHeal()) {
				netPoints++;
			}
		}
		
		
		setSR(netPoints);
		didUpdate();
	}
	

	//NEED TO FIND A WAY TO GET RANK ABOVE
	public void didUpdate() {
		if(getSR() >= getRank().getMaxSR()) {
			setRank(getRank().getAboveRank());
		}else if(getSR() <= getRank().getMinSR()){
			setRank(getRank().getBelowRank());
		}
	}

	
}
