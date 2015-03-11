public class CommandLineTest {
	
	public static void main(String[] args) {
		
		int hello = 0;
		
		args[0]=hello;
		
		for (int i = 0; i < hello; i++) {
			System.out.println("This is the" + i + "go out of:" + hello);
		}
	}
}