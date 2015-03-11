/**
 * A Counter maintains a count value, which can be
 * incremented and reset to zero.
 * 
 *  @author Luke
 */
public class Counter {

	//Fields
	private int count;
	
	//Constructors	
	/** Default constructor, initialises counter value at zero. */
	public Counter() {
		count = 0;
	}
	
	/**
	 * Initialises a newly created Counter object with a custom value.
	 * 
	 * @param count the initial value of the counter.
	 */
	public Counter(int count) {
		this.count = count;
	}
	
	//Methods
	/** Sets the value of the counter to that specified in the argument.
	 *
	 * @param count the int value at which the count should be set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/** Returns the current value of the counter.
	 * 
	 * @return the current value of the counter.
	 */
	public int getCount() {
		return count;
	}
	
	/** Increments the counter value by one. */
	public void increment() {
		count = count + 1;
	}
	
	/**Decrements the counter valuce by one. */
	public void decrement() {
		count = count - 1;
	}
	
	public void incrementBy(int amount) {
		count = count + amount;
	}
	
	public boolean isZero() {
		return count==0;
	}
	
	
	/** Resets the counter value to zero. */
	public void reset() {
		count = 0;
	}
	
	/** Returns a textual representation of the counter.
	 * 
	 * @return a textual representation of the counter.
	 */
	public String toString() {
		return "Counter:[count=" + count + "]";
	}
	
	
	
}
