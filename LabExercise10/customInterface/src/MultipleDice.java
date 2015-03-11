import java.util.ArrayList;
import java.util.List;

public class MultipleDice implements Rollable {

	// Fields
	private List<Die> dice;

	// Constructors
	public MultipleDice() {
		dice = new ArrayList<Die>();
	}

	public MultipleDice(int init_size) {
		dice = new ArrayList<Die>();

		for(int count = 0; count < init_size; count++) {
			dice.add(new Die());
		}
	}	

	// Methods
	public void addDie(Die die) {
		dice.add(die);
	}

	public void removeDie(int index) {
		dice.remove(index);
	}

	public Die getDie(int index) {
		return dice.get(index);
	}

	public int getSize() {
		return dice.size();
	}

	public boolean isEmpty(){
		return dice.isEmpty();
	}

	public void clear() {
		dice.clear();
	}

	public void roll() {
		for(Die element: dice) {
			element.roll();
		}
	}

	public int getScore() {
		int totalScore = 0;
		for(Die element: dice) {
			totalScore += element.getScore();
		}
		return totalScore;
	}

	public void setDie(int index, Die d) {
		if ((index < dice.size()) && (index >= 0)) {
			dice.set(index, d);
		}
	}

	@Override
	public String toString() {
		return this.getClass().getName() + ":[dice=" + dice + "]";
	}
}