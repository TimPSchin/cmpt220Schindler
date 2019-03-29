package softwareDevelopement;

public class Lab_6_3 {

	public static void main(String[] args) {
		
		SoccerMatch SM1 = new SoccerMatch("Redville Stadium", "Reds", "Blues");
		//Red Team Players
		Player Red1 = new Player("Red", 4, "Reds");
		Player Red2= new Player("Rojo", 4, "Reds");
		Player Red3 = new Player("Orange-Red", 4, "Reds");
		Player Red4 = new Player("Scarlet", 4, "Reds");
		Player Red5 = new Player("Crimson", 4, "Reds");
		Player Red6 = new Player("Ruby", 4, "Reds");
		Player Red7 = new Player("Chilli", 4, "Reds");
		Player Red8 = new Player("Apple", 4, "Reds");
		Player Red9 = new Player("Raspberry", 4, "Reds");
		Player Red10 = new Player("Maroon", 4, "Reds");
		//Blue Team Players
		Player Blue1 = new Player("Red", 4, "Reds");
		Player Blue2 = new Player("Rojo", 4, "Reds");
		Player Blue3 = new Player("Orange-Red", 4, "Reds");
		Player Blue4 = new Player("Scarlet", 4, "Reds");
		Player Blue5 = new Player("Crimson", 4, "Reds");
		Player Blue6 = new Player("Ruby", 4, "Reds");
		Player Blue7 = new Player("Chilli", 4, "Reds");
		Player Blue8 = new Player("Apple", 4, "Reds");
		Player Blue9 = new Player("Raspberry", 4, "Reds");
		Player Blue10 = new Player("Maroon", 4, "Reds");
		
		SM1.addHomePlayer(Red1);
		SM1.addHomePlayer(Red2);
		SM1.addHomePlayer(Red3);
		SM1.addHomePlayer(Red4);
		SM1.addHomePlayer(Red5);
		SM1.addHomePlayer(Red6);
		SM1.addHomePlayer(Red7);
		SM1.addHomePlayer(Red8);
		SM1.addHomePlayer(Red9);
		SM1.addHomePlayer(Red10);
		
		SM1.addVisitorPlayer(Blue1);
		SM1.addVisitorPlayer(Blue2);
		SM1.addVisitorPlayer(Blue3);
		SM1.addVisitorPlayer(Blue4);
		SM1.addVisitorPlayer(Blue5);
		SM1.addVisitorPlayer(Blue6);
		SM1.addVisitorPlayer(Blue7);
		SM1.addVisitorPlayer(Blue8);
		SM1.addVisitorPlayer(Blue9);
		SM1.addVisitorPlayer(Blue10);
		
		Goal R1 = new Goal(4, Red1);
		Goal R2 = new Goal(15, Red4);
		Goal B1 = new Goal(40, Blue9);
		SM1.addHomeGoal(R1);
		SM1.addHomeGoal(R2);
		SM1.addVisitorGoal(B1);
		
		SM1.endDate();
		
		System.out.println("The winner are the " + SM1.getWinner());
		SM1.getHomeGoals();
		SM1.getVisitorGoals();
		
		
	}


		
}

