import java.util.Scanner;


public class ScannerSurprise {

	public static void main(String[] args) {
		//create a Scanner for keyboard input
		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter a number");
		int number = sc.nextInt();	//read a number
		System.out.println("You entered the number " + number);
//8
		sc.nextLine(); 
		
		
		System.out.println("Type a sentence");
		String sentence = sc.nextLine();	//read a whole line
		System.out.println("You entered the sentence " + sentence.length());
		
		
		
		System.out.println("Enter a number: ");
		double decimal = sc.nextDouble(); //read a number
		System.out.println("You entered the decimal " + decimal);
		
		sc.nextLine();
		
		//CURRENTLY SENTENCE BELOW IS SKIPPED - FIX THIS BY CALLING nextLine() HERE
		
		System.out.println("Type a sentence");
		String sentence1 = sc.nextLine();	//read a whole line
		System.out.println("You entered the sentence " + sentence1.length());
		
		sc.close(); //close the Scanner

	}

}

/* Progress to next line - this is needed otherwise the following
 * call to the nextLine() method below will seemingly do nothing.
 *  
 * This is because the nextInt() method above reads the number 
 * input but ignores the newline '\n' character which is added 
 * to the input stream by pressing the enter key. When nextLine()
 * is called it "advances the scanner past the current line and
 * returns the input that was skipped".
 */