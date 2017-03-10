package e93;

public class Main2 {

	    public static void main(String[] args) {
	        Person pekka = new Person("Pekka", 15, 2, 1983);
	        Person martin = new Person("Martin", 1, 3, 1983);
	        Person me = new Person("Me", 9, 10, 1994);


	        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );//false
	        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );//true
	        System.out.println( me.getName() + " is older than " +  pekka.getName() + ": "+ me.olderThan(pekka) );//false

	    }
	}
	  

