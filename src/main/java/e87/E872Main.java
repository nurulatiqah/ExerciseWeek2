package e87;

/**
 * @author nurulatiqahali
 * price difference between apartment
 */
public class E872Main {
	public static void main(String[] args) {
		ApartmentComparison studioManhattan = new ApartmentComparison(1, 16, 5500);// 88000
		ApartmentComparison twoRoomsBrooklyn = new ApartmentComparison(2, 38, 4200);// 159600
		ApartmentComparison fourAndKitchenBronx = new ApartmentComparison(3, 78, 2500);// 195000

		System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn)); // 71600
		System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn)); // 35400
	}
}
