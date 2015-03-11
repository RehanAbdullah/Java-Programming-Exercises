/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
 public class Name implements Comparable<Name> {

	//Fields
	private String firstName;
	private String familyName;

	
	//Constructors
	public Name() {
		firstName = "";
		familyName = "";
	}

	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	//Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getFullName() {
		return firstName + " " + familyName;
	}

	public String toString() {
		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}

	public int compareTo(Name other) {
		int result = this.firstName.compareTo(other.firstName);
		if (result == 0) {
			result = this.familyName.compareTo(other.familyName);
		}
		return result;
	}
	
	


}
