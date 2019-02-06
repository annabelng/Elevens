/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[]ranks = {"one","two","three"};
		String[]suites = {"diamonds","spades","clubs"};
		int[] value = {1,2,3};
		Deck abc = new Deck(ranks, suites, value);
	}
}
