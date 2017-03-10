package e91;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(MyDate compared) {
		// first we'll compare years
		if (this.year < compared.year) {
			return true;
		}

		// if the years are the same, we'll compare the months
		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		// years and months the same, we'll compare the days
		if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
			return true;
		}

		return false;
	}

	/**
	 * advance date by 1. assume that all the months have 30 days!
	 */
	public void advance() {
		this.day++;
		if (this.day > 30) {
			this.month++;
			this.day = 1; // if day more than 30, count day = 1
		}
		if (this.month > 12) {
			this.year++;
			this.month = 1;
		}
	}

	/**
	 * @param numberOfDays,
	 *            advance the day by the number given as parameter. Implement
	 *            this method so that it calls the method advance()
	 */
	public void advance(int numberOfDays) {
		int i = 0;
		while (i < numberOfDays) {// the number given as parameter.
			advance();// advance the day
			i++;
		}
	}

	/**
	 * @param days
	 * @return a new MyDate-object
	 */
	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(day, month, year);
		newMyDate.advance(days);
		return newMyDate;// has the date which equals the date of the object
	}
}
