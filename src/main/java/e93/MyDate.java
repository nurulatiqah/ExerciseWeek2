package e93;

/**
 * @author nurulatiqahali
 *
 */
public class MyDate {
	private int day;
	private int month;
	private int year;

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	/**
	 * @param comparedDate
	 *            calculates the difference in years of the object for which the
	 *            method is called and the object given as parameters.
	 * @return difference
	 */
	public int differenceInYears(MyDate comparedDate) {
		int difference = (this.year) + (this.month /12) + (this.day /365);
		int difference2 = (comparedDate.year) + (comparedDate.month/12) + (comparedDate.day /365);
		
		if(this.year > comparedDate.year){
			return difference - difference2;
		}else
			return Math.abs(difference - difference2);

		// _____________________________________________________92.1
		// int difference = 0;
		// if(this.year > comparedDate.year){
		// difference = this.year - comparedDate.year;
		// }
		// return difference;
		// }else if(this.year < comparedDate.year){
		//
		// }
		// return Math.abs(difference); //positive
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	/**
	 * @param compared
	 *            years,days,month
	 * @return true if true
	 */
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
}
