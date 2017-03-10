package e89;

/**
 * @author nurulatiqahali
 *
 */

public class BoundedCounter {
	private int value;
	private int upperLimit;

	/**
	 * @param upperLimit
	 */
	public BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	/**
	 * @param s. set value to int s.
	 */
	public void setValue(int s) {
		value = s; //console

	}
	
	/**
	 * @return value from getValue
	 */
	public int getValue() {

		return this.value; 
	}
	
	/**
	 * advanced for min,sec,n hours
	 */
	public void next() {
		value++;
		if (value > upperLimit) {
			value = 0; // advanced for minutes,hours,seconds
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		//78.1	 return "" + value; 
			
		return String.format("%02d", value); //00 format
	}

}
