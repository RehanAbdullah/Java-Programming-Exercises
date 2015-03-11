public class Equal {
	
	//Fields
		private String firstName;
		private String familyName;

		//Constructors
		public Equal() {
			firstName = "";
			familyName = "";
		}

		public Equal(String firstName, String familyName) {
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
		
		public boolean contains(Object o) {
			if((o==null ? o==null : o.equals(o)))
					return false;
			Equal other = (Equal) o;
			return this.familyName.equals(other.getFamilyName())
					&& this.firstName.equals(other.getFirstName());
		}

		public String toString() {
			return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
		}
}
