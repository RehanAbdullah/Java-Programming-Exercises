public class ModuloCounter {

	//	Fields
	private int count;
	private Object Counter;
   
		
	//	Constructors
	public ModuloCounter() {
		setCount(0);
	}

	public ModuloCounter(int count) {
		this.setCount(count);
	}

	//	Methods

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount11() {
		return count;
	}

	public String getCount() {
		return null;
	}

	public static boolean isEven(int count) {
	    return (count & 1) == 0;
	  }

	public Object getCounter() {
		return Counter;
	}

	public void setCounter(Object counter) {
		Counter = counter;
	}
	
	
}



