import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Register {

	//	Fields
	private ArrayList<Name> namelist;
	private String name;
	private String familyName;
	private String firstName;

	//	Constructors
	public Register() {
		namelist = new ArrayList<Name>();
	}

	//	Methods
	public String toString() {
		return "Register:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}

	public void sortRegister() {
    	Collections.sort(namelist);
    	namelist.sort(Comparator.naturalOrder());
    }
	
	public void sortRegisterReverse() {
    	namelist.sort(Comparator.reverseOrder());
		
	}
	
	public void sortRegisterCustom() {
		namelist.sort(Comparator.comparing(Name::getFirstName,Comparator.reverseOrder())
				.thenComparing(Name::getFamilyName));
	}
	
	
	
	public void addName(Name r) {
		namelist.add(r);
	}

	public void removeName(int i) {
		namelist.remove(i);
	}
	
	

	public void clearRegister() {
		namelist.clear();
	}

	public boolean isRegisterEmpty() {
		return namelist.isEmpty();
	}

	public int size() {
		return namelist.size();
	}
	
	
	//	accepts a String argument and returns true or false depending on 
	//	whether a name exists with that respective first name.

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

	//	That accepts a char argument and returns an int defining the number
	//	of occurrences of a family name, starting with the provided character.

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

	 public String getNameList() {
	    	String s = "PlayList: " + this.name + "\n";
	        
	        for (int i = 0; i < namelist.size(); i++) {
	            s = s + (i+1) + "\t" + namelist.get(i).toString() + "\n";
	        }
	        return s;       
	    }
	


}

