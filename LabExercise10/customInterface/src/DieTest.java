import java.util.ArrayList;
import java.util.List;


public class DieTest {

	public static void main(String[] args) {

		List<Rollable> dice = new ArrayList<Rollable>();
		
		dice.add(new Die());
		dice.add(new PairOfDice());
		dice.add(new MultipleDice(5));
		for (Rollable r : dice) {
		System.out.println("Score? " + r.getScore());
		r.roll();
		System.out.println(r.toString());
		}

		

		
	}

}
