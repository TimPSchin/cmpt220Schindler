import java.util.Scanner;
public class Project_2 {

	public static void main(String args[]) {
		//Setting ranks
		Rank bronze = new Rank("Bronze", 10, 7, 20, 1500, 2000, 17, 0, 1499);
		Rank silver = new Rank("Silver", 15, 12, 23, 4000, 3000, 15, 1500, 1999);
		Rank gold = new Rank("Gold", 20, 16, 25, 5000, 5000, 13, 2000, 2499);
		Rank platinum = new Rank("Platinum", 25, 20, 26, 8000, 7500, 14, 2500, 2999);
		Rank diamond = new Rank("Diamond", 30, 23, 29, 11000, 9000, 10, 3000, 3499);
		Rank master = new Rank("Master", 35, 27, 30, 14000, 11000, 11, 3500, 3999);
		Rank grandMaster = new Rank("Grand Master", 40, 33, 36, 17000, 15000, 13, 4000, 5000);
		
		//Setting above and below
		bronze.setAboveRank(silver);
		silver.setAboveRank(gold);
		gold.setAboveRank(platinum);
		platinum.setAboveRank(diamond);
		diamond.setAboveRank(master);
		master.setAboveRank(grandMaster);
		
		gold.setBelowRank(silver);
		platinum.setBelowRank(gold);
		diamond.setBelowRank(platinum);
		master.setBelowRank(diamond);
		grandMaster.setBelowRank(master);
		silver.setBelowRank(bronze);
		
		//Variables 
		String name;
		int SR;
		String win;
		int kills;
		int objKills;
		int objTime;
		int damage;
		int healing;
		int deaths;
		
		//Main Frame
		Scanner banter = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("This is Timothy Schindler's Ranking System");
		System.out.println("================Project  2================");
		System.out.println("Please enter your Player infromation: ");
		System.out.println("Enter your name: ");
		name = banter.next();
		System.out.println("Enter your Skill Rank: ");
		SR = banter.nextInt();
		
		//Creating the player
		Player player1 = new Player(name, SR);
		
		if(SR >= 0 && SR <= 1499 )
			player1.setRank(bronze);
		else if(SR >= 1500 && SR <= 1999)
			player1.setRank(silver);
		else if(SR >= 2000 && SR <= 2499)
			player1.setRank(gold);
		else if(SR >= 2500 && SR <= 2999)
			player1.setRank(platinum);
		else if(SR >= 3000 && SR <= 3499)
			player1.setRank(diamond);
		else if(SR >= 3500 && SR <= 3999)
			player1.setRank(master);
		else if(SR >= 4000)
			player1.setRank(grandMaster);
		
		//Getting Performance Stats
		System.out.println("Did you win (yes or no)");
		win = banter.next().toLowerCase();
		System.out.println("Eliminations: ");
		kills = banter.nextInt();
		System.out.println("Objective Eliminations: ");
		objKills = banter.nextInt();
		System.out.println("Objective Time: ");
		objTime = banter.nextInt();
		System.out.println("Damage: ");
		damage = banter.nextInt();
		System.out.println("Healing Done: ");
		healing = banter.nextInt();
		System.out.println("Deaths: ");
		deaths = banter.nextInt();
		
		//Creating Performance Class
		Performance player1Perf = new Performance(player1, kills, objKills, objTime, damage, healing, deaths);
	
		if(win.equals("yes")) {
			player1Perf.setWin(true);
		}else if(win.equals("no")) {
			player1Perf.setWin(false);
		}
		
		
		int oldSR = player1.getSR();
		player1.getNewSR(player1Perf);
		
		
		System.out.println();
		System.out.println("==========================================");
		System.out.println("Your old SR was: " + oldSR);
		System.out.println("Your new SR is: " + player1.getSR());
		System.out.println("Your rank is: " + player1.getRank());
		System.out.println("==========================================");
		System.out.println();
		System.out.println("Thank you for using my program! - Tim");
	}
}
