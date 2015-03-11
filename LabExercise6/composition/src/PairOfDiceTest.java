
public class PairOfDiceTest {


	public static void main(String[] args) {
		PairOfDice pair = new PairOfDice(new Die(5), new Die(5));


		pair.roll();


		System.out.println(pair.toString());
		System.out.println(pair.getRed());
		System.out.println(pair.getBlue());
		System.out.println("Red score =" + pair.getRed().getScore());
		System.out.println("score of pair =" + pair.getScore());
		System.out.println("\n");
		PairOfDice pair2 = new PairOfDice();

		pair2.roll();

		System.out.println(pair2.toString());
		System.out.println(pair2.getRed());
		System.out.println(pair2.getBlue());
		System.out.println("Red score =" + pair2.getRed().getScore());
		System.out.println("score of pair =" + pair2.getScore());



	}


}
