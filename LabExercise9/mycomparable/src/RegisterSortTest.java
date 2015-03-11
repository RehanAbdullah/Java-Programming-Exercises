import java.util.ArrayList;

public class RegisterSortTest {

	public static void main(String[] args) {
		ArrayList<Name> register = new ArrayList<Name>();

		//Register Object
		Register regis = new Register();

		regis.addName(new Name("Lionel", "Messi"));
		regis.addName(new Name("Rehan", "Abdullah"));
		regis.addName(new Name("Joel", "Blogger"));
		regis.addName(new Name("John", "Bloody"));
		regis.addName(new Name("Josh", "Blood"));

		//Declaring a String
		String i = "Rehan";
		String i2 = "John";

		//This will output true or false
		System.out.println(regis.searchRegisterByFirstName("Rehan"));
		System.out.println(regis.searchRegisterByFirstName(i));
		System.out.println(regis.searchRegisterByFirstName("John"));

		System.out.println("=============================");

		
		//output some details
		System.out.println(regis.toString() + "\n");


		System.out.println("=============================");

		System.out.println(regis.countFamilyNameOccurrences('B'));

		System.out.println("=============================");

		regis.sortRegister(); 
		System.out.println(regis.getNameList());

		System.out.println("=============================");

		regis.sortRegisterReverse();
		System.out.println(regis.getNameList());

		System.out.println("=============================");

		regis.sortRegisterCustom();
		System.out.println(regis.getNameList());

		System.out.println("=============================");

		// The Compare Test
		if (i.compareTo(i2) < 0 ) { // then s1 is before s2
			System.out.println(i +" is before "+ i2);
		}
		else if (i.compareTo(i2) == 0 ) { // then i and i2 same
			System.out.println(i +" is the same as "+ i2);
		}
		else if(i.compareTo(i2) > 0 ) { // then i is after i2
			System.out.println(i +" is after "+ i2);
		}
	}

}

