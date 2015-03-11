

import java.util.Random; //importing the Random class

/** 
 * A Die has a number of sides and a score shown by its face value.
 * The die can be rolled to give a new score.
 * 
 * @author la/lz
 */
public class Die implements Rollable {

	//Fields
	private int sides; 
	private int score;
	
	/* A random number generator instance. 
	 * 'static' modifier means that the same Random object is used by all instances of Die. 
	 */
	private static Random rand = new Random();
		
	//Constructors
	/** Default constructor that creates a die with six sides. 
	 * The die is rolled to give a random initial score.  
	 */
	public Die() {
		this(6); //calls the custom constructor with the default of six sides
	}

	/** Creates a die with the given number of sides. 
	 * The die is rolled to give a random initial score.  
	 * 
	 * @param sides the number of sides the die will have.
	 */
	public Die(int sides){
		this.sides = sides;
		this.roll();
	}
	
	//Methods
	/** Rolls the die to give the next score. The score is a
	 * randomly generated number in the range 1..sides inclusive. 
	 */
	public void roll() {
		score = rand.nextInt(sides) + 1;
	}
		
	/** Returns the number of sides on the die.
	 * 
	 * @return the number of sides on the die.
	 */
	public int getSides() {
		return sides;
	}

	/** Returns the current face value of the die.
	 * 
	 * @return the current face value of the die.
	 */
	public int getScore() {
		return score;
	}
	
	/** Returns a textual representation of the die.
	 * 
	 * @return a textual representation of the die.
	 */
	public String toString() {
		return "Die:[sides=" + sides + ", score=" + score + "]";
	}
	
}