import java.util.ArrayList;

public class Player {

	//Fields
	private ArrayList<Name> namelist; //collection of names
	private Name name; //name of the name
	private Rollable rollable; //name of dice


	//Constructors
	/** Create an empty Player with a default name and pair of dice. */
	public Player() {
		name = new Name();
		rollable = new PairOfDice();
	}
	/**Creates a player with a custom name and
	 * custom pair of dice */
	public Player(Name name, Rollable rollable) {
		this.name = name;
		this.rollable = rollable;
		
	}

	//Methods
	/** Creates the name
	 * @param name to set  
	 * */
	public Name setName(Name name) {
		return this.name = name;
	}
	
	/** Gets the name
	 * @return name */
	public Name getName() {
		return name;
	}
	
	public int size() {
		return namelist.size();
	}
		
/**Add a void method setFullPlayerName(...) that accepts a single String argument (e.g. â€œJoe Bloggsâ€� 
	and then uses this to set the first and family name individually by extracting the relevant 
	information and then calling the respective setter methods of the Name class. */
	public void setFullPlayerName(String fullPlayerName) {
		String[]hello = fullPlayerName.split(" ");
		name.setFirstName(hello[0]);
		name.setFamilyName(hello[1]);
	}
	
//	
//	public void getPlayer() { 
//		return ;
//	}
	
	/**Gets the pair of dice
	 * @return the pair of dice */
	public Rollable Rollable() {
		return rollable;
	}

	/**Sets the dice
	 * @param The dice to set */
	public void setRollable(Rollable rollable) {
		this.rollable  = rollable;
	}
	
	/**Rolls the dice */
	public void rollDice() {
		rollable.roll();
	}

	/**Gets the dice score
	 * @return the dice score */
	public int getRollable() {
		return rollable.getScore();
	}


	/**Returns a string containing the namelist register data. */
    @Override
	public String toString() {
		return "Player:[name = " + name + ", rollable=" + rollable + "]";
	}



}
