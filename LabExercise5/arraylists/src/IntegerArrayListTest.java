//need to import ArrayList from within java.util package
import java.util.ArrayList; 

public class IntegerArrayListTest {

	public static void main(String[] args) {
		//create an ArrayList of numbers using the Integer wrapper class
		ArrayList<Integer> list = new ArrayList<Integer>();
		//print list, should be empty
		System.out.println(list.toString());

		//populate with some numbers
		list.add(8);  //auto-boxing, actually: add(new Integer(8)) 
		list.add(32);
		list.add(5);

		//using the other add method
		list.add(1,5);  //inserts 5 at index 1
		list.add(0,104);  //inserts 104 at index 0

		//print list contents
		System.out.println(list.toString());


		//output the current size of the list
		System.out.println("The size is: " + list.size());


		//print element at index 0 using get method
		System.out.println("First element is: " + list.get(0));


		//searches for item (5) and returns index
		int pos = list.indexOf(5);
		System.out.println("Index of 5: (expected 2) result is "  + pos);


		//use contains() to check whether some number is in the list
		if (list.contains(104)) {
			System.out.println("The list contains 104"); //should print this
		}
		else {
			System.out.println("The list does NOT contains 104");
		}
		
		
		//print using a for-i loop with size() and get(i)
		System.out.println("\nUsing standard for-i loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		//print using for-each loop
		System.out.println("Using for-each loop");
		for (Integer x : list) {
			System.out.println(x);
		}

		//print using forEach method (added in Java 8)
		System.out.println("Using forEach method");
		//passes a lambda expression to the method
		list.forEach(x -> System.out.println(x));


		//TEST OTHER METHODS HERE...


	}

}
