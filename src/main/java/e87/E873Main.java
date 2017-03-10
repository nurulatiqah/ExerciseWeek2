package e87;

/**
 * @author nurulatiqahali
 * boolean condition between apartment
 * which is more expensive
 */
public class E873Main {
	public static void main(String[] args) {
		ApartmentComparison studioManhattan = new ApartmentComparison(1, 16, 5500);
		ApartmentComparison twoRoomsBrooklyn = new ApartmentComparison(2, 38, 4200);
		ApartmentComparison fourAndKitchenBronx = new ApartmentComparison(3, 78, 2500);
		
		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
		System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
		  
	}
}
