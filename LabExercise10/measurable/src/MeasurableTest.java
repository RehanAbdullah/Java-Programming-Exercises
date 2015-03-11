import java.util.ArrayList;


public class MeasurableTest {

	public static void main(String[] args) {

		ArrayList<Measurable> dice = new ArrayList<>();
		dice.add(new Die());
		dice.add(new Die(5));
		dice.add(new Die(8));
		int total = DataAnaylsis.sum(dice);
		System.out.println("Sum of dice: " + total);
		int average = DataAnaylsis.avg(dice);
		System.out.println("Avg of dice: " + average);
	

		 ArrayList<Measurable> songs = new ArrayList<>();
		 
		 songs.add(new Song("Radio Gaga", 281, "Queen"));
		 songs.add(new Song("Rock you", 331, "Ibid."));
		 songs.add(new Song("Flash", 190, "Ibid."));
		 total = DataAnaylsis.sum(songs);
		 System.out.println("Sum of songs: " + total);
		 average = DataAnaylsis.avg(songs);
		 System.out.println("Avg of songs: " + average);
		 

		System.out.println("\n");
		
		System.out.println("==========Name Class=========");
		
		ArrayList<Measurable> names = new ArrayList<Measurable>();
		
		names.add(new Name("Rehan","Abdullah"));
		names.add(new Name("Anew","Person"));
		
		System.out.println("The combined length of the first and last name: " + DataAnaylsis.sum(names));
		System.out.println("The combined length of the first and last name: " + DataAnaylsis.avg(names));
		
	}

}


