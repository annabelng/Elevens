import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//declaring ArrayList that will contain all the cards
	private ArrayList<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards. Cards are dealt from the top
	 * (highest index) down. The next card to be dealt is at size - 1.
	 */
	//size variable
	private int size;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits, and produces
	 * one of the corresponding card.
	 * 
	 * @param ranks
	 *            is an array containing all of the card ranks.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */
	//constructor w three arrays passed in
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//initializing the list of cards
		cards = new ArrayList<Card>();
		//traversing through the ranks/point value
		//because each rank corresponds w a certain point value
		for (int r = 0; r < ranks.length; r++) {
			//traversing through the suites
			for(int s = 0; s < suits.length; s++){
				//adding the new card - taking values from the arrays in the parameters
				//ranks and values have same index
				//suites have separate index
				Card newCard = new Card(ranks[r], suits[s],values[r]);
				//adding the new card to the arraylist of cards
				cards.add(newCard);
			}
		}
		//initializing the cards variable to the number of cards in the array list 
		size = cards.size();
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * 
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//declaring boolean that will check if it is empty or not
		boolean empty;
		//checks if the size variable is equal to 0
		if (this.size == 0) {
			//sets boolean to true if that's the case
			empty = true;
		} else {
			//if not empty, set to false
			empty = false;
		}
		//return the boolean
		return empty;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * 
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//returns the size variable of the specific object
		return this.size;
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
        //Use the Random object defined below.
        Random rand = new Random(101); //do not alter
        
        //example use:
        //generate number between 1 and 100 
        //inclusive -> rand.nextInt(100-1+1)+1; 
        //rand.nextInt(range+1)+min
        Card temp;
        for(int i = cards.size()-1; i > 0; i--){
        	int random = rand.nextInt(cards.size()-1);
        	temp = cards.get(i);
        	cards.remove(i);
        	cards.add(i,cards.get(random));
        	cards.add(random, temp);
        }
        size = cards.size();
        
	}

	/**
	 * Deals a card from this deck.
	 * 
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//checks if size is greater than 0
		//has to be greater than 0 in order to be runnable
		if (size > 0) {
			//decrements size of that specific object by one
			//also checks how many cards are left
			this.size--;
			//return the card that was just "removed" by returning the last index
			return cards.get(size);
		} else {
			//if size is equal to 0 then deal returns null
			return null;
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * 
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
