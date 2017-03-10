package e86;

/**
 * @author nurulatiqahali
 * calculate money in register and after register on the card
 */
public class E864Main {
	 public static void main(String[] args) {
	        CashRegister unicafeExactum = new CashRegister();
	        System.out.println( unicafeExactum );

	        LyyraCard cardOfJim = new LyyraCard(2);

	        System.out.println("money on the card: " + cardOfJim.balance() + " euros");

	        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
	        System.out.println("payment success: " + succeeded);

	        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

	        succeeded = unicafeExactum.payGourmet(cardOfJim);
	        System.out.println("payment success: " + succeeded);

	        System.out.println("the card balance: " + cardOfJim.balance() + " euros");

	        System.out.println( unicafeExactum );
	    }
	}
	

