import java.util.ArrayList;

/**
 * A client application that highlights the behaviour
 * of different counter types. The substitution principle
 * allows subclass types to be stored in a list of a 
 * superclass type. Whilst polymorphism is applied to process
 * objects with differences in a uniform way, within the
 * for-each loop.
 * 
 *  @author LA
 */

public class CounterTest {

	public static void main(String[] args) {
		ArrayList<Counter> counters = new ArrayList<Counter>();
		
		counters.add(new Counter(1));
		counters.add(new ModuloCounter(0,5));
		counters.add(new OffsetCounter(100, 5));
		counters.add(new BoundedCounter(50, 50, 60));
		//add a StepCounter once implemented
		
		for (Counter c : counters) {
			
			System.out.print(c.toString() + "\n");
			
			for (int i = 0; i < 20; i++) {
				System.out.print(c.getCount() + "\t");
				c.increment();
			}
			System.out.println("\t");
		}

	}

}
