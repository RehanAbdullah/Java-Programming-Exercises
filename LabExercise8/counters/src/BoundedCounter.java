
/**
 * A BoundedCounter maintains a count value, which can be
 * incremented, decremented and reset, so long as the
 * value stays within a minimum and maximum bounded range. 
 * 
 * It can specify whether the count value is currently at
 * its minimum or maximum range and it will not wrap
 * between these, i.e. incrementing at max does nothing.
 * 
 *  @author LA
 */

public class BoundedCounter extends Counter {

	//fields
	private int max;
	private int min;
	
	//constructors
	public BoundedCounter() {
		super();
		min = 0;
		max = 10;
	}
	
	public BoundedCounter(int count, int min, int max) {
		super(count);
		this.min = min;
		this.max = max;
		if (count < min) {
			super.setCount(min);
		}
	}
	
	//methods
	public boolean isMax() {
		return super.getCount() == max;
	}
	
	public boolean isMin() {
		return super.getCount() == min;
	}
	
	@Override
	public void increment() {
		if (!isMax()) {
			super.increment();
		}
	}
	
	@Override
	public void decrement() {
		if (!isMin()) {
			super.decrement();
		}
	}
	
	@Override
	public void reset() {
		super.setCount(min);
	}
	
	@Override 
	public void setCount(int count) {
		if (count >= min && count <= max) {
			super.setCount(count);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "[min=" + min + ", max=" + max + "]";
	}
	
}
