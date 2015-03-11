import java.util.ArrayList;


public class MeasurerTest {

	public static void main(String[] args) {
		ArrayList<Object> dice = new ArrayList<>();
		dice.add(new Die());
		dice.add(new Die()); //etc
		dice.add(new Die());
		dice.add(new Die()); //etc
		
		
		Measurer m = new DieScoreMeasurer();
		
		int total = DataAnalysis.sum(dice, new DieScoreMeasurer());
		System.out.println("Sum of die score: " + total);
		
		
		
		total = DataAnalysis.sum(dice, obj -> ((Die) obj).getSides()); //better shorthand version
		System.out.println("Sum of die sides: " + total);


	}

}
