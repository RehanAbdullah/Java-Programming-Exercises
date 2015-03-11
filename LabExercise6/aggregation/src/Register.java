import java.util.ArrayList;

public class Register {

	//	Fields
	private ArrayList<Name> namelist; //collection of names
	private String familyName; // the name of the namelist
	private String firstName; // the name of the namelist

	//	Constructors
	/** Create an empty Register with no title. */
	public Register() {
		this.familyName ="Untitled";
		this.firstName ="Untitled";
		namelist = new ArrayList<Name>();
	}

	//	Methods
	
	/** Adds the given name to the end of the namelist.
     * @param s The Name to add. */
	public void addName(Name r) {
		namelist.add(r);
	}

	/** Removes the name at index i from the namelist.
     * @param i The index of the name to be remove,
     * provided 0 &le; i &lt; number of names, otherwise does nothing.*/
	public void removeName(int i) {
		namelist.remove(i);
	}
    /** Clears all entries from the namelist */
	public void clearRegister() {
		namelist.clear();
	}
	
	 /** Checks if the namelist is empty.
     * @return true or false depending on whether the namelist is empty. */
	public boolean isRegisterEmpty() {
		return namelist.isEmpty();
	}
	
	 /** Returns the name at index i.
     * @return The name at index i, provided &le; i &lt; 
     * number of names. Otherwise returns null.*/
	public Name getName(int i) {
		Name s = null;
		if (0 <= i && i < namelist.size()) {
			s = namelist.get(i);
		} else {
			s = null;
		}
		return s;
		
	}
	
	/** Returns the size of this namelist.
	 * @return The size of this namelist */
	public int size() {
		return namelist.size();
	}
		
	/**Returns a string containing the namelist register data. */
    @Override
	public String toString() {
		return "Register:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	

	/**	That accepts a String argument and returns true or false depending on 
		whether a name exists with that respective first name. */
	public boolean searchRegisterByFirstName(String first) {
		//    	using for-each loop
		boolean exists = false;
		for (Name i  : namelist) {
			if (i.getFirstName().equals(first)) {    			
				exists = true;
			}
		}
		return exists;
	}

	/**	That accepts a char argument and returns an int defining the number
		of occurrences of a family name, starting with the provided character. */
	public int countFamilyNameOccurrences(char c) {
		//using for-each loop
		int count = 0;
		int i = 0;
		for(Name s: namelist) {
			if(s.getFamilyName().charAt(i)==c) {
				count++;
			}
		}
		return count;
	}


}
