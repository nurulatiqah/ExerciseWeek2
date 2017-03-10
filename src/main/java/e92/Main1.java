package e92;

public class Main1 {
	 public static void main(String[] args) {
	        MyDate first = new MyDate(24, 12, 2009);
	        MyDate second = new MyDate(1, 1, 2011);
	        MyDate third = new MyDate(25, 12, 2010);
	        //2011-2009
	        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );//second-first
	        //2010-2009
	        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );
	        //2011-2010
	        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );
	    }
}
