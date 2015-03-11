
public class ConverterNew {

	public static void main(String[] args) {
		//declare two variables of type double
		double f, c;
		//declare a variable of type boolean, initialised to true
		boolean b = true;
		
		if (b) {
			//assign 20 to c
			c = 20;
			//assign the result of the formula to f
			f = c*9/5+32;
			//print out the results
			System.out.println(c + " degrees Centigrade = " + f + " degrees Fahrenheit");
		} else {
			//assign 68 to f
			f = 68;
			//assign the result of the formula to c
			c = 5/9.0*(f-32);
			//print out the results
			System.out.println(f + " degrees Fahrenheit = " + c + " degrees Centigrade");
		}
		
		

	}

}
