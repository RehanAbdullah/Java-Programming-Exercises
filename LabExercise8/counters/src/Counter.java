
/**
 * A Counter maintains a count value, which can be
 * incremented, decremented, and reset to zero.
 * 
 *  @author LA
 */

public class Counter {

	//fields
	private int count;
	
	//constructors	
	public Counter() {
		count = 0;
	}

	public Counter(int count) {
		this.count = count;
	}
	
	//methods	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void increment() {
		count = count + 1;
	}
	
	public void decrement() {
		count = count - 1;
	}
	
	public void reset() {
		count = 0;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName()  + "[count=" + this.count + "]";
	}
	
}
