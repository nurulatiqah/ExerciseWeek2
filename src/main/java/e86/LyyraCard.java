package e86;

public class LyyraCard {
	private double balance;

    /**
     * @param balance initialized balance
     */
    public LyyraCard(double balance) {
        this.balance = balance;
    }

    /**
     * @return balance
     */
    public double balance() {
        return this.balance;
    }

    /**
     * @param amount,adding balance with amount
     */ 
    public void loadMoney(double amount) {
        this.balance += amount;
    }

    /**
     * @param amount
     * @return true if statements correct
     */
    public boolean pay(double amount){
    	
    	if(balance>=amount){
    		balance-=amount;
    		return true;
    	}
    		return false;
    	}
		
       // the method checks if the balance of the card is at least the amount given as parameter
       // if not, the method returns false meaning that the card could not be used for the payment
       // if the balance is enough, the given amount is taken from the balance and true is returned
    }

