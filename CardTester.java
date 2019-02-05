/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card tenHeart = new Card("ten","hearts",10);
		Card fiveSpades = new Card("five","spades",5);
		Card fourDiamonds = new Card("four","diamonds",4);
		
		System.out.println(tenHeart.pointValue());
		System.out.println(tenHeart.rank());
		System.out.println(tenHeart.suit());
		System.out.println(tenHeart.matches(fourDiamonds));
		System.out.println(tenHeart.toString());
		
		System.out.println(fiveSpades.pointValue());
		System.out.println(fiveSpades.rank());
		System.out.println(fiveSpades.suit());
		System.out.println(fiveSpades.matches(fourDiamonds));
		System.out.println(fiveSpades.toString());
		
		System.out.println(fourDiamonds.pointValue());
		System.out.println(fourDiamonds.rank());
		System.out.println(fourDiamonds.suit());
		System.out.println(fourDiamonds.matches(tenHeart));
		System.out.println(fourDiamonds.toString());
	}
}
