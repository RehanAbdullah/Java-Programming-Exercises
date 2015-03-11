import java.util.Scanner;


public class ScreenRobotTest {

	public static void main(String[] args) {
		ScreenRobot robot = new ScreenRobot();
		System.out.println(robot.toString());
		robot.forward(10);
		System.out.println(robot.toString());
		robot.turnLeft();
		robot.forward(5);
		System.out.println(robot.toString());
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input;
		@SuppressWarnings("unused")
		int amount;
		
		do {
			System.out.println("\nMenu\n-----\nforward\nrotate\nhome\nexit\n-----\n");
			input = sc.next();
			
			if (input.equals("forward")) {
				System.out.println("Foward by?");
				robot.forward(sc.nextInt());
				
			} else if (input.equals("rotate")) {
				robot.turnLeft();
				
			} else if (input.equals("home")) {
				robot.home();
				
			} else if (input.equals("exit")) {
				System.out.println("Exiting...");
			} else {
				System.out.println("Invalid command!");
			}
 			
			System.out.println(robot.getPosition());
			
			
		} while (!input.equals("exit")); 
		
	}

}
