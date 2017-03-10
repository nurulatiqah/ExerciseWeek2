package e84;

public class E84OverloadedCounter {
	private int num;
	private boolean checks;

	/**
	 * constructor with differences param
	 */
	public E84OverloadedCounter() {// old call new
		this(0, false);
	}

	public E84OverloadedCounter(int startingValue) {
		this(startingValue, false);
	}

	public E84OverloadedCounter(boolean check) {
		this(0, check);
	}

	public E84OverloadedCounter(int startingValue, boolean check) {
		num = startingValue;
		checks = check;
	}

	/**
	 * @return returns the current value of the counter
	 */
	public int value() {

		return num;
	}

	/**
	 * increases the value of the counter by one
	 */
	public void increase() {
		if(num>=0){
			checks=true;
			num++;
		}
		
		//System.out.println(num);
	}

	/**
	 * decreases the value of the counter by one, but not below 0 if the check
	 * is on
	 */
	public void decrease() {
			if (num >= 0) {
				num--;
			} else {
				value();
			}
	}

	/**
	 * @param increaseAmount
	 *            increases the value by the amount of the parameter. If the
	 *            value of the parameter is negative, the value will not change.
	 */
	public void increase(int increaseAmount) {
		if (num >= 0) {
			num += increaseAmount;
		}
	}

	/**
	 * @param increaseAmount
	 *            decreases the value of the counter by the amount given by the
	 *            parameter, but not below 0 if the check is on. If the value of
	 *            the parameter is negative, the value of the counter will not
	 *            change.
	 */
	public void derease(int increaseAmount) { // not understand
		if (checks == true && num >= 0) {
			num -= increaseAmount;
		} else if (num < 0) {
			num = 0;
		}
	}

}
