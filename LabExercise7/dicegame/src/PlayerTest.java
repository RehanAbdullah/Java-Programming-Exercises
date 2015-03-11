import java.util.ArrayList;

public class PlayerTest {


	public static void main(String[] args) {
		ArrayList<Player> name = new ArrayList<Player>();
		ArrayList<Player> name1 = new ArrayList<Player>();

		
		Player b = new Player();
		Player c = new Player();
		Player d = new Player();
		Player e = new Player();

		b.setFullPlayerName("Rehan Abdullah");
//		System.out.println(b.getName());
		name1.add(b);
		
		c.setFullPlayerName("Sachin Tendulkar");
//		System.out.println(c.getName());
		name1.add(c);
		
		d.setFullPlayerName("Brett Lee");
//		System.out.println(d.getName());
		name1.add(d);
		
		e.setFullPlayerName("Andrew Flintoff");
//		System.out.println(e.getName());
		name1.add(e);

		


		System.out.println("List of player names:");
		System.out.println("=============================================");

		for (int i=0;i < name1.size(); i++) {
			System.out.println(name1.get(i).getName().getFullName());
		}

		System.out.println("=============================================");

		name.add(new Player(new Name("Rehan","Abdullah"), new PairOfDice()));
		name.add(new Player(new Name("Sachin","Tendulkar"), new PairOfDice()));
		name.add(new Player(new Name("Brett","Lee"), new PairOfDice()));
		name.add(new Player(new Name("Andrew","Flintoff"), new PairOfDice()));


		name.forEach(n -> System.out.println(n.getName()));

		System.out.println("=============================================");

		name.forEach(n -> System.out.println(n.getPairOfDice()));
		System.out.println("=============================================");

		
		for (Player p : name) {
			p.rollDice();
			System.out.println(p.getName() + " score: " + p.getDiceScore());
		}




		System.out.println("=============================================");

		System.out.println("The highest score is...  "  +name.stream().mapToInt(n -> n.getDiceScore()).max());

		System.out.println("=============================================");

		//name.stream().mapToInt(n -> n.getDiceScore()).max();
		

	

	}


}


