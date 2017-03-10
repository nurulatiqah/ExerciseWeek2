package e90;

/**
 * @author nurulatiqahali
 *
 */
public class Player {
	private String name;
	private int goal;

	/**
	 * @param name, constructor player
	 */
	public Player(String name) {
		this(name, 0);
	}

	/**
	 * @param name
	 * @param goals
	 */
	public Player(String name, int goals) {
		this.name = name;
		this.goal = goals;
	}

	
	
	public String toString() {
		return this.name + ",goals " + this.goal;
	}

	/**
	 * 
	 * @return the number of goals.
	 */
	public int goal() {
		return this.goal;
	}

}
