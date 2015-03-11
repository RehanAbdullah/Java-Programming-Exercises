
/**
 * A ModuloCounter maintains a count value, which can be
 * incremented and decremented and reset to zero. It also
 * has a modulo value ensuring the count stays within
 * the range 0..modulo-1 by wrapping appropriately.
 * 
 *  @author LA
 */

public class ModuloCounter extends Counter {

	//fields
	private int modulo;
	
	//constructors
	public ModuloCounter() {
		super();
		modulo = 10;
	}
	
	public ModuloCounter(int count, int modulo) {
		super(count);
		this.modulo = modulo;
	}
	
	//methods
	public int getModulo() {
		return modulo;
	}	
	
	@Override
	public void increment() {
		if (super.getCount() < modulo-1) {
			super.increment();
		} else {
			super.reset();
		}
	}
	
	@Override
	public void decrement() {
		if (super.getCount() > 0) {
			super.decrement();
		} else {
			super.setCount(modulo-1);
		}
	}
	
	@Override 
	public void setCount(int count) {
		if (count >= 0 && count <= modulo-1) {
			super.setCount(count);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+ "[modulo=" + modulo + "]";
	}
	
}
