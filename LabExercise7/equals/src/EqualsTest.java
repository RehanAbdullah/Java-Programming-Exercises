import java.util.ArrayList;


public class EqualsTest {
	
	ArrayList<Equal> name= new ArrayList <Equal>();

	public static void main(String[] args) {
		
		String a = new String("hello");
		String b = new String("hello");
		
		System.out.println("a==b is: " + (a==b));
		System.out.println("a.equals(b) is: " + a.equals(b));
		
		System.out.println("============");
		
		Name n = new Name("Joe", "Bloggs");
		Name n1 = new Name("Joe", "Bloggs");
		System.out.println("n==n1 is: " + (n==n1));
		
		System.out.println("n.equals(n1) is: " + n.equals(n1));

	}

}
