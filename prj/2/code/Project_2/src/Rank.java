
public class Rank {

	public String name;
	public double avgKills;
	public double avgObjKills;
	public double avgObjTime;
	public double avgDamage;
	public double avgHeal;
	public double avgDeaths;
	public int minSR;
	public int maxSR;
	public Rank aboveRank;
	public Rank belowRank;
	
	public Rank() {}
	
	public Rank(String name, double avgKills, double avgObjKills, double avgObjTime, 
			double avgDamage, double avgHeal, double avgDeaths, int minSR, int maxSR) {
		this.name = name;
		this.avgKills = avgKills;
		this.avgObjKills = avgObjKills;
		this.avgObjTime = avgObjTime;
		this.avgDamage = avgDamage;
		this.avgHeal = avgHeal;
		this.avgDeaths = avgDeaths;
		this.minSR = minSR;
		this.maxSR = maxSR; 
		
		
	}
	
	
	public void setAboveRank(Rank r) {
		this.aboveRank = r;
	}
	
	public void setBelowRank(Rank r) {
		this.belowRank = r;
	}

	public Rank getAboveRank() {
		return aboveRank;
	}

	public Rank getBelowRank() {
		return belowRank;
	}

	public int getMinSR() {
		return minSR;
	}

	public int getMaxSR() {
		return maxSR;
	}

	public String getName() {
		return name;
	}
	
	public double getAvgKills() {
		return avgKills;
	}
	
	public double getAvgObjKills() {
		return avgObjKills;
	}
	
	public double getAvgObjTime() {
		return avgObjTime;
	}
	
	public double getAvgDamage() {
		return avgDamage;
	}
	
	public double getAvgHeal() {
		return avgHeal;
	}
	
	public double getAvgDeath() {
		return avgDeaths;
	}

	
}
