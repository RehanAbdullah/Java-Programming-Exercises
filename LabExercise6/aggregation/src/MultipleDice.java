import java.util.ArrayList;

public class MultipleDice {


	//	Fields
	private String DiceTitle;
	private ArrayList<Die> dielist;
	private Die dieObject;

	//	Constrctors
	public void multipleDice() {
	} {
		this.DiceTitle= "DICE";
		dielist = new ArrayList<Die>();

	}

	public MultipleDice(int dieObjects){
		for (int i = 0; i < dieObjects; i++) 
			dielist.add(dieObject);
		}

		//	Methods

		public String dieListTitle() {
			return DiceTitle;
		}

		public void addDie(Die k) {
			dielist.add(k);
		}
		

	   
		public void removeDie(int j) {
		dielist.remove(j);
		}
	    
	    //check if the list is empty
	    public boolean isDieListEmpty() {
	        return dielist.isEmpty();
	    }
		
		//check the size of the list
		public int dielistSize() {
			return dielist.size();
		}
		
		/** Returns a Die object from the given index.
	     * @param i the index for the DIe object to be retrieved from.
	     * @return n a Die object
	     */
		public Die getDie(int i) {
			Die n = null;
			if (0 <= i && i < dielistSize()) {
				n = dielist.get(i);
			} else {
				n = null;
			}
			return n;
		}
		
		// roll die list 
		public void rollDiceList() {
			for(Die dieObject : dielist) {
				dieObject.roll();
			}
		}

		public void rollAll() {
			for(Die dieObject : dielist){
			dieObject.roll();
			}
		}
	    
	    
		public String getDieList() {
		String s = "The DieList: " + this.DiceTitle + "\n";
				for (int i = 0; i < dielist.size(); i++) {
					s = s + dielist.get(i).toString() + "\n";
		
		}
		return s;
		}
	    
	    // Get total Score of the DieList
		public int getTotalScore() {
			int sum = 0;
			for(int i = 0; i < dielistSize(); i++) {
				sum = sum+dielist.get(i).getScore();
				}
				return sum;
			}


		}
