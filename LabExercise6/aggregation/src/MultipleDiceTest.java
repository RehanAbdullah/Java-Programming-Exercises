public class MultipleDiceTest {

	public static void main(String[] args) {
		MultipleDice dc = new MultipleDice(0);

		System.out.println("Multiple Dice, testing all the methods " + dc.dieListTitle());
		dc.addDie(new Die());
		dc.addDie(new Die());

		System.out.println(dc.getDie(0) + "\n" 
				+dc.getDie(1)+"\n"
				+dc.getDie(2));

		dc.rollDiceList();
		System.out.println("\n\nRolled Dice List" + dc.getDieList());

		dc.getTotalScore();
		System.out.println("Total of the rolled dice " + dc.getTotalScore());



	}
}