import java.util.Scanner;
import java.util.Random;
class FurtherIGG
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		Random rand = new Random();
		// points
		int round = 1;
		int score = 0;
		// guess
		while (round<11)
		{
			System.out.println("\nround " +round+ ":");
			System.out.println();
			System.out.println("I am thinking of a number from 1 to 10.");
			System.out.println("You must guess what it is in three tries.");
			System.out.println("Enter a guess:");
			// three
			int three = 1;
			int guess = 0;
			// rand
			int numb = rand.nextInt(10)+1;
			while (guess!=numb&&three<4)
			{
				guess = keyb.nextInt();
				if (guess==numb)
				{
					System.out.println("RIGHT!");
					System.out.println("You have won the game.");
					score++;
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
				}
				else if (three==3)
				{
					System.out.println("The correct number was " +numb+ ".");
					System.out.println("You have lost the game.");
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
				}
				else
				{
					switch (Math.abs(guess-numb))
					{
						case 1:
							System.out.println("hot");
							break;
						case 2:
							System.out.println("warm");
							break;
						default:
							System.out.println("cold");
					}
				}
				three++;
			}
			round++;
		}
		String xp = new String();
		switch (score)
		{
			case 10:
				xp += "hacker";
				break;
			case 9:
				xp += "professional";
				break;
			case 8:
				xp += "advanced";
				break;
			default:
				xp += "amateur";
				break;
		}
		System.out.println("******************");
		System.out.println("*Congratulations!*");
		System.out.println("******************");
		System.out.println("      You are     ");
		System.out.println("!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!" +xp+ "!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!");
	}
}