import java.util.ArrayList;


public class StringListTest {

	public static void main(String[] args) {

		ArrayList<String> fruit = new ArrayList<String>();

		fruit.add("Apple");
		fruit.add("Pear");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Strawberry");
		fruit.add("Grape");               System.out.println(fruit.toString());



		fruit.set(0, "Apple");
		fruit.set(1, "Pear");
		fruit.set(2, "Orange");
		fruit.set(3, "Banana");
		fruit.set(4, "Strawberry");
		fruit.set(5, "Grape");            System.out.println(fruit.toString());

		fruit.remove(1);
		fruit.remove(fruit.size()-2);     System.out.println(fruit.toString() +"\n");

		for(String s: fruit){
			System.out.println(s.toUpperCase());
		}


		System.out.println("\n");


		for(int i = 0; i< fruit.size(); i++) {
			System.out.println((i+1) + ":" + fruit.get(i).toUpperCase());
		}
		
		System.out.println("\n");
		
		fruit.forEach(s->System.out.println(s.toLowerCase()));


	}

}
