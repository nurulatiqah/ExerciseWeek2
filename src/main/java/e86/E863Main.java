package e86;

/**
 * @author nurulatiqahali
 * payment success if enough balance in card
 * paying with card
 */
public class E863Main {
	 public static void main(String[] args) {
	      CashRegister unicafeExactum = new CashRegister();

	        double theChange = unicafeExactum.payEconomical(10);
	        System.out.println("the change was " + theChange );//7.5

	        LyyraCard cardOfJim = new LyyraCard(7);

	        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
	        System.out.println("payment success: " + succeeded);//true
	        succeeded = unicafeExactum.payGourmet(cardOfJim);
	        System.out.println("payment success: " + succeeded);//false
	        succeeded = unicafeExactum.payEconomical(cardOfJim);
	        System.out.println("payment success: " + succeeded);//true

	        System.out.println( unicafeExactum );
	    }
}
