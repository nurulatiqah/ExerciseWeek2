package e86;

public class CashRegister {

	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	private double balance;
	private final double ECONOMICALLUNCH = 2.50;
	private final double GOURMETLUNCH = 4.00;

	/**
	 * @param card
	 * @param sum
	 */
	public void loadMoneyToCard(LyyraCard card, double sum) {
		/*
		 * To complete the assignment, extend the cash register with a method
		 * that can be used to load cash to Lyyra Cards. When a certain amount
		 * is loaded to the card, the amount stored in the register increases
		 * correspondingly. Remember that the amount to be loaded needs to be
		 * positive! The method skeleton:
		 */
		card.loadMoney(sum);//load cash
		this.cashInRegister+=sum;
	}

	/**
	 * @param card
	 * @return true if balance enough
	 */
	public boolean payEconomical(LyyraCard card) {
		if (card.balance() >= ECONOMICALLUNCH) {
			economicalSold++;
			card.pay(ECONOMICALLUNCH);
			return true;
		} else
			return false;
	}

	/**
	 * @param card
	 * @return true if balance enough
	 */
	public boolean payGourmet(LyyraCard card) {
		if (card.balance() >= GOURMETLUNCH) {
			gourmetSold++;
			card.pay(GOURMETLUNCH);//balance-=amount
			return true;
		} else
			return false;
	}

	 /**
	 * beginning of cashInRegister
	 */
	public CashRegister() {
	        cashInRegister = 1000;
	    }

	    /**
	     * @param cashGiven
	     * @return cashGiven if not enough
	     */
	    public double payEconomical(double cashGiven) {
//	    	double economicalLunch = 2.50;
	    	if(cashGiven>=ECONOMICALLUNCH){
	    		cashInRegister+=ECONOMICALLUNCH;
	    		economicalSold++;
	    		balance = cashGiven- ECONOMICALLUNCH;;
	    		return balance;
	    	}	
	    	else 
	    		return cashGiven;//else return all	
	    }

	    /**
	     * @param cashGiven
	     * @return cashGiven if not enough
	     */
	    public double payGourmet(double cashGiven) {
//	    	double gourmetLunch = 4.00;
	    	if(cashGiven>=GOURMETLUNCH){
	    		cashInRegister+=GOURMETLUNCH;
	    		gourmetSold++;
	    		balance = cashGiven- GOURMETLUNCH;
	    		return balance;
	    	}
	    	else 
	    		return cashGiven;		
	    }

	    public String toString() {
	        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
	    }

}
