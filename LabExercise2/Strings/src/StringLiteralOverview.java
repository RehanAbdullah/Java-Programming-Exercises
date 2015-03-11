
public class StringLiteralOverview {

	public static void main(String[] args) {
		//creates a String literal object
		String s1 = "abc";
		
		//creates a new String object using a constructor
		//this is the normal way to create an object, but is not necessary for Strings
		String s2 = new String("abc");
		
		//creates another String literal, which will reference the same object as s1
		String s3 = "abc";
			
		
		/* To understand the difference between creating a literal and using 
		 * the constructor the 3 variables above may be compared.
		 * 
		 * In Java the == operator compares object references whereas
		 * the .equals() method compares the object's internal state.
		 * 
		 * (s1 == s2) is false as they have different object references
		 * (s1 == s3) is true as they point to same object reference
		 * (s1.equals(s2)) is true as their content is the same
		 * (s1.equals(s3)) is true as their content is also the same
		 * 
		 * In conclusion, use String literals as they share references
		 * and are therefore more efficient. They are also simpler to write!
		 */
		
		
		if (s1 == s2) {
			System.out.println("s1 == s2 is true");
		} else {
			System.out.println("s1 == s2 is false");
		}
		
		
		if (s1 == s3) {
			System.out.println("s1 == s3 is true");
		} else {
			System.out.println("s1 == s3 is false");
		}
		
		
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2) is true");
		} else {
			System.out.println("s1.equals(s2) is false");
		}
		
		
		if (s1.equals(s3)) {
			System.out.println("s1.equals(s3) is true");
		} else {
			System.out.println("s1.equals(s3) is false");
		}
		

	}

}
