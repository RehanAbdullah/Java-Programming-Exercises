
public class NameArrayTest {

	
	public static void main(String[] args) {
		//declare array to hold four Name objects
		Name[] friends = new Name[4];
		
		//create Name object and assign reference into array
		Name n = new Name("Joe", "Bloggs");
		friends[0] = n;
		
		//create Name objects and assign reference directly into array
		friends[1] = new Name("Fred", "Perry");
		friends[2] = new Name("Diti", "Hammond");
		friends[3] = new Name("Bulsar", "Raymond");
		
		//loop through each element
		for(int i = 0; i < friends.length; i++) {
			//use accessor method to output first name of each
			System.out.println(friends[i].getFirstName());
		}
		
		//declare boolean used as a flag
		boolean exists = false;
		
		//loop through each Name object using a for-each loop
		for (Name nm : friends) {
			//check family name
			if (nm.getFamilyName().equals("Smith")) {
				exists = true;
			}
		}

		//output result of search
		if (exists) {
			System.out.println("There is a person with family name of Smith");
		} else {
			System.out.println("There is not a person with family name of Smith");
		}
		
	}

}