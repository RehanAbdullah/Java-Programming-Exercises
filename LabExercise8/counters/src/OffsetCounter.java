
/**
 * An OffsetCounter maintains an underlying count value, 
 * which can be incremented, decremented, and reset to zero. 
 * 
 * The count value that it returns has an offset applied.
 * 
 *  @author LA
 */

public class OffsetCounter extends Counter {

	//fields
	private int offset;
	
	//constructors
	public OffsetCounter() {
		super();
		offset=1;
	}
	
	public OffsetCounter(int count, int offset) {
		super(count);
		this.offset = offset;
	}
	
	//methods
	public int getOffset() {
		return offset;
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	@Override
	public int getCount() {
		return super.getCount() + offset;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[offset=" + offset + "]";
	}
	
}
