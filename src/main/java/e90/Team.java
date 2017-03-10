package e90;

import java.util.ArrayList;

/**
 * @author nurulatiqahali
 *
 */

public class Team {
	private String name;
	// private int size;
	private int maxSize = 16;
	private ArrayList<Player> players;

	/**
	 * @param name, constructor of Team class
	 */
	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<Player>();
	}
	
	/**
	 * @return name for player
	 */
	public String getName() {
		return this.name;
	}

	
	/**
	 * @param player, add player
	 */
	public void addPlayer(Player player) {
		// player.add(brian);
		if (players.size() < maxSize) {
			players.add(player);
		}
	}

	/**
	 * print player in the array of players
	 */
	public void printPlayers() {
		// System.out.println(player); (print in the shapes of array)
		for (Player player : players) {
			System.out.println(player);
		}
	}

	/**
	 * @param maxSize
	 * @return maxSize = 16
	 */
	public int setMaxSize(int maxSize) {
		this.maxSize = maxSize;
		return maxSize;
	}
	
	/**
	 * @return size of player
	 */
	public int size() {
		return players.size();
	}
	
	/**
	 * @return total goals, call method goal().
	 */
	public int goals() {
		int totalG = 0;
		for (Player player : players) { 
			totalG += player.goal();
		}
		return totalG;
	}
}
