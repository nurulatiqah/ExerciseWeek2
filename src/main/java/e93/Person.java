package e93;

import java.util.Calendar;

//import e91.MyDate; difference package
public class Person {
	private String name;
	private int days;
	private int months;
	private int years;
	private MyDate birthday;

	public Person(String name, int pp, int kk, int vv) { // name,day,month,year
		this.name = name;
		this.days = pp;
		this.months = kk;
		this.years = vv;
		this.birthday = new MyDate(pp, kk, vv);// date,month,year
	}

	/**
	 * calucate the difference = java.util.Calendar(for latest date)
	 * @return the age of the person.
	 */
	public int age() {
		//compared years with this year
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int date = Calendar.getInstance().get(Calendar.DATE);

		this.birthday = new MyDate(date, month, year);
		int difference = this.years - year + ((this.months - month) / 12) + ((this.days - date) / 30);
		// calculate the age based on the birthday and the current day
		// you get the current day as follows:
		// return a Calendar instance based on the current time in the default
		// time zone with the default locale.
		// Calendar.getInstance().get(Calendar.DATE);
		// Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we
		// add one, 0 to 11
		// Calendar.getInstance().get(Calendar.YEAR);
		return Math.abs(difference);
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.name + ", born " + this.birthday;
	}

	/**
	 * compare the ages based on birthdate
	 * 
	 * @param compared
	 * @return
	 */
	public boolean olderThan(Person compared) {

		if (this.years < compared.years) {
			return true;
		}

		// if the years are the same, we'll compare the months
		if (this.years == compared.years && this.months < compared.months) {
			return true;
		}

		// years and months the same, we'll compare the days
		if (this.years == compared.years && this.months == compared.months && this.days < compared.days) {
			return true;
		}

		return false;

		// if(birthday.earlier(compared.birthday)){
		// return true;
		// }
	}

	/**
	 * @param name
	 * @param birthday
	 */
	public Person(String name, MyDate birthday) {
		this.name = name;
		this.birthday = birthday;// 15.2.1983
	}

	/**
	 * steve birthday,today
	 * @param name
	 */
	public Person(String name) {
		//this(name, );
		this.name = name;
		
		years = Calendar.getInstance().get(Calendar.YEAR);
		months = Calendar.getInstance().get(Calendar.MONTH) + 1;
		days = Calendar.getInstance().get(Calendar.DATE);
		this.birthday = new MyDate(days, months, years);

	}
}
