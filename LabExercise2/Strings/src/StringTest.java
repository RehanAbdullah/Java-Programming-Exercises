
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//creates a String literal
		String myName = "Wayne Rooney";
		String myGame = "Wayne Rooney is a foolish kicker";
	
		
		String upperCaseName = myName.toUpperCase();
		System.out.println("Name in Upper Case: "+upperCaseName);

		String newStr = myName.replace("a","E");
		System.out.println("old = " + myName);
		System.out.println("new = " + newStr); 


		String substr = "";

		substr = myGame.substring(7, 17);
		System.out.println("substring = " + substr);

		substr = myGame.substring(0, 7);
		System.out.println("substring = " + substr);


		String str1 = "Collections of tutorials at tutorials point";
		  
	    System.out.println("index = " + str1.indexOf("tutorials", 10)); 
	    System.out.println("index = " + str1.indexOf("admin", 9));
		
		
		
		//declares a variable of type char
		char c;

		//prints out the value of the String literal
		System.out.println(myName);
		//invokes the charAt method on the String literal object "myName" passing
		//the parameter value 3 and assigning the returned character to "c"
		c = myName.charAt(3);
		//concatenates the character to a String literal and prints it
		System.out.println("4th character is: " + c);
		//concatenates the int value returned by the length method
		//to another String literal and prints it.
		System.out.println("Length is: " + myName.length());
		//invokes the endsWith method, passing the parameter value "ney"
		//and evaluates the boolean value returned
		if (myName.endsWith("ney") ) {
			System.out.println(myName + " ends with \"ney\" ");
		} 
		else

		{
			System.out.println(myName + " does not end with \"ney\" ");
		}
		//...TO COMPLETE...try more String methods listed in the API


	}

}
