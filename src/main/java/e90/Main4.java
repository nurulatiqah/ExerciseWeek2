package e90;

public class Main4 {
	 public static void main(String[] args) {
		    Team barcelona = new Team("FC Barcelona");
		        barcelona.setMaxSize(1);

		        Player brian = new Player("Brian");
		        Player pekka = new Player("Pekka", 39);
		        barcelona.addPlayer(brian);
		        barcelona.addPlayer(pekka);
		        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

		        System.out.println("Number of players: " + barcelona.size());
		    }
}
