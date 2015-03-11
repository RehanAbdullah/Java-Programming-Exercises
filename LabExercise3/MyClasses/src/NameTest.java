
public class NameTest {

	public static void main(String[] args) {
		
		System.out.println("Testing default constructor initialisation and toString method...");
		Name n = new Name();
		System.out.println("Expected both empty strings: Actual: " + n.toString());
		
		
		System.out.println("---------");
		
		
		System.out.println("Testing set and get methods for title and artist...");
		n.setTitle("Hit 'em Up");
		n.setArtist("Tupac");
		System.out.println("Expected Changes: Actual: " + n.getTitle());
		System.out.println("Expected Tupac: Actual: " + n.getArtist());
		
		System.out.println("---------");
		
		System.out.println("Testing custom constructor initialisation...");
		Name artist = new Name("Tupac", "Shakur");
		
		System.out.println("Testing get method for full name...");
	
		artist.setArtist("Tupac");
		System.out.println("Expected Tupac Shakur: Actual: " + artist.getArtist());
		
	}

}
