/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Name {

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

	@Override
	public boolean equals(Object obj) {
		// test exceptional cases, i.e. obj is a Name, and not null
		if ((this.getClass() != obj.getClass()) || (obj == null) )
			return false;
		Name other = (Name) obj; // cast to a Name object
		// compare first & family names using the String .equals()
		return this.familyName.equals(other.familyName)
				&& this.firstName.equals(other.firstName);
	}
}