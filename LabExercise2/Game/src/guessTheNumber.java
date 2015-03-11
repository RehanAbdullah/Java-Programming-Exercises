import java.io.*;

class guessTheNumber
{
	public static void main (String[] args) throws IOException

	{
		InputStreamReader inSystem = new InputStreamReader (System.in);

		BufferedReader stdin = new BufferedReader (inSystem);         

		int number, guess;

		int numOfTries = 0;

		System.out.println("Welcome to Guess The Number!");

		System.out.println("Player one please enter the number to be guessed (1->1000):");

		String userInput = stdin.readLine();

		number = Integer.parseInt(userInput);

		System.out.println("");

		System.out.println("");

		System.out.println("-------------------------");

		System.out.println("Player two guess the number:");

		String userInput2 = stdin.readLine();

		guess = Integer.parseInt(userInput2);

		numOfTries = 1;

		while (number != guess) {
			numOfTries++;

			{
				if (guess == number)

					System.out.println("Congratulations, you guessed it!!!");

				else if (guess < number)

					System.out.println("Your guess is too low!  Please try again.");
				else if (guess > number)

					System.out.println("Your guess is too high!  Try a lower number.");

				System.out.println("Guess again:");

				userInput2 = stdin.readLine();

				guess = Integer.parseInt(userInput2);
			}
		}
		System.out.println("Congratulations you got it!!!");
		System.out.println("The number was " + number);
		System.out.println("It took you " + numOfTries + " tries");

	}
}
