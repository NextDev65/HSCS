import java.util.Scanner;
import java.util.Random;
class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		Random rand = new Random();
		int numb = rand.nextInt(10)+1;
		// three
		int three = 1;
		int guess = 0;
		// guess
		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in three tries.");
		System.out.println("Enter a guess:");
		while (guess!=numb&&three<4)
		{
			guess = keyb.nextInt();
			if (guess==numb)
			{
				System.out.println("RIGHT!");
				System.out.println("You have won the game.");
			}
			else if (three==3)
			{
				System.out.println("The correct number was " +numb+ ".");
				System.out.println("You have lost the game.");
			}
			else
				System.out.println("wrong");
			three++;
		}
	}
}