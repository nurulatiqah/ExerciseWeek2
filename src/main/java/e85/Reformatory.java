package e85;

/**
 * @author nurulatiqahali
 *
 */
public class Reformatory {
	private int times=0;
    public int weight(Person person) {
       // returns the weight of the person
    	times++;
       return person.getWeight();
    }

	/**
	 * @param brian
	 * feed person
	 */
	public void feed(Person brian) {
		int feed = brian.getWeight() +1;
		brian.setWeight(feed);
	}

	/**
	 * @return how many times method total weight loop
	 */
	public int totalWeightsMeasured() {
	
		return times;
	}
}
  