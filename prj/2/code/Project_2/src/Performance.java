
public class Performance {

	public Player player;
	public boolean win;
	public int kills;
	public int objKills;
	public int objTime;
	public int damage;
	public int healing;
	public int deaths;
	
	public Performance() {}
	
	public Performance(Player plyr, int kills, int objKills, int objTime, int damage, int healing, int deaths) {
		this.player = plyr;
		this.kills = kills;
		this.objKills = objKills;
		this.objTime = objTime;
		this.damage = damage;
		this.healing = healing;
		this.deaths = deaths;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public Player getPlayer() {
		return player;
	}
	
	public boolean getWin() {
		return win;
	}
	
	public int getKills() {
		return kills;
	}
	
	public int getObjKills() {
		return objKills;
	}
	
	public int getObjTime() {
		return objTime;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getHealing() {
		return healing;
	}
	
	public int getDeaths() {
		return deaths;
	}
	
	
	
}
