
public class PairOfDice {

	//	fields
	private Die red;
	private Die blue;

	//	constructor
	public PairOfDice() {
		red = new Die();
		blue = new Die();
	}

	public PairOfDice(Die r, Die b) {
		red = r;
		blue = b;
	}

	//	method
	public void roll() {
		red.roll();
		blue.roll();

	}

	public int getScore() {
		return red.getScore() + blue.getScore();
	}

	public String toString(){

		return "PairOfDice:[red=" + red + ", blue=" + blue + "]";

	}

	public Die getBlue() {
		return blue;
	}



	public Die getRed() {
		return red;
	}

}
