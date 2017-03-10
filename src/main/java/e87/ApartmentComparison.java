package e87;

/**
 * @author nurulatiqahali
 * apartment comparison 
 */
public class ApartmentComparison {
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;
	private int price,price2;

	/**
	 * @param rooms
	 * @param squareMeters
	 * @param pricePerSquareMeter
	 */
	public ApartmentComparison(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	/**
	 * @param otherApartment
	 * @return the largest
	 */
	public boolean larger(ApartmentComparison otherApartment) {//87.1
		if (this.rooms > otherApartment.rooms) {
			return true;
		}
		if (this.rooms == otherApartment.rooms && this.squareMeters > otherApartment.rooms) {
			return true;
		}
		if (this.rooms == otherApartment.rooms && this.squareMeters == otherApartment.rooms
				&& this.pricePerSquareMeter > otherApartment.rooms) {
			return true;
		}
		return false;
	}
	
	/**
	 * @param otherApartment
	 * @return the price difference,which is more expensive
	 */
	public int priceDifference(ApartmentComparison otherApartment) {//87.2
		price = squareMeters * pricePerSquareMeter;
		price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

		if ((price) > (price2)) {
			return price - price2;
		}

		return price2 - price;
	}
	
	/**
	 * @param otherApartment
	 * @return true if price is more expensive
	 */
	public boolean moreExpensiveThan(ApartmentComparison otherApartment) { //87.3
		price = this.squareMeters * this.pricePerSquareMeter;
		price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		if (price > price2) {
			return true;
		}
		return false;
	}
}
