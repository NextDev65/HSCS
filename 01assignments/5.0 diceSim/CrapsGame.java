import java.util.Scanner;
import java.util.Random;
class CrapsGame
{
	// NextDev65
	// CrapsGame - a basic Craps Simulator
	public static void main(String[] args)
	{
		//  big bro
		System.out.println(" ^ ^ _ ^ ^  ^ ^ _ ^ ^  ^ ^ ^ ^ _ ^ ^ ");
		System.out.println("^ ! ^-^ ! ^^ ! ^-^ ! ^^ ! ^ ! ^-^ ! ^");
		System.out.println(" ^ ^   ^ ^  ^ ^   ^ ^  ^ ^ ^ ^   ^ ^ ");
		System.out.println("  |     |    |     |    |   |     |  ");
		System.out.println("  ^     ^    ^     ^    ^   ^     ^  ");
		System.out.println(" ^ ^ _ ^ ^ ^ ^  _ ^ ^ _ ^ ^ ^  _ ^ ^ ");
		System.out.println("^ ! ^-^  Next  ^-^   ^-^ Dev  ^-^ ! ^");
		System.out.println(" ^ ^   ^ ^ ^ ^    ^ ^   ^ ^ ^    ^ ^ ");
		System.out.println("  ^     ^    ^     ^    ^   ^     ^  ");
		System.out.println("  |     |    |     |    |   |     |  ");
		System.out.println(" ^ ^ _ ^ ^  ^ ^ _ ^ ^  ^ ^ ^ ^ _ ^ ^ ");
		System.out.println("^ ! ^-^ ! ^^ ! ^-^ ! ^^ ! ^ ! ^-^ ! ^");
		System.out.println(" ^ ^   ^ ^  ^ ^   ^ ^  ^ ^ ^ ^   ^ ^ ");
		System.out.println("=====================================");
		// cash
		Scanner keyb = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Starting Amount :: ");
		int cash = keyb.nextInt();
		// points
		int round = 1;
		int score = 0;
		int choice = 0;
		// guess
		while (cash>0&&choice!=2)
		{
			// bet
			System.out.print("bet :: ");
			int bet = keyb.nextInt();
			while (bet>cash)
			{
				System.out.println("you need more $");
				System.out.print("bet :: ");
				bet = keyb.nextInt();
			}
			System.out.println("=================================");
			// toss
			int toss = rand.nextInt(6)+1;
			System.out.println("P1 tossed a " +toss);
			// roll
			int roll = rand.nextInt(6)+1;
			System.out.println("P1 rolled a " +roll);
			// craps ?
			System.out.println();
			switch (toss+roll)
			{
				// win
				case 7:
					System.out.println("YOU WIN!!!");
					cash += bet;
					System.out.println("sum is " +(toss+roll));
					System.out.println();
					score++;
					System.out.println("cash :: " +cash);
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
					break;
				case 11:
					System.out.println("YOU WIN!!!");
					cash += bet;
					System.out.println("sum is " +(toss+roll));
					System.out.println();
					score++;
					System.out.println("cash :: " +cash);
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
					break;
				// lose
				case 2:
					System.out.println("YOU LOSE!!!");
					cash -= bet;
					System.out.println("sum is " +(toss+roll));
					System.out.println();
					System.out.println("cash :: " +cash);
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
					break;
				case 3:
					System.out.println("YOU LOSE!!!");
					cash -= bet;
					System.out.println("sum is " +(toss+roll));
					System.out.println();
					System.out.println("cash :: " +cash);
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
					break;
				case 12:
					System.out.println("YOU LOSE!!!");
					cash -= bet;
					System.out.println("sum is " +(toss+roll));
					System.out.println();
					System.out.println("cash :: " +cash);
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
					break;
				// try again
				default:
					System.out.println("(try again)");
					System.out.println("sum is " +(toss+roll));
					System.out.println();
					System.out.println("cash :: " +cash);
					System.out.println("You have won " +score+ " out of " +round+ " round(s).");
					break;
			}
			round++;
			// choice
			System.out.println("=================================");
			System.out.println("1 :: new game");
			System.out.println("2 :: quit game");
			System.out.println("3 :: continue");
			System.out.print("? :: ");
			choice = keyb.nextInt();
			System.out.println("=================================");
			System.out.println();
			while (choice!=1&&choice!=2&&choice!=3)
			{
				System.out.println("not a choice");
				System.out.println("=================================");
				System.out.println("1 :: new game");
				System.out.println("2 :: quit game");
				System.out.println("3 :: continue");
				System.out.print("? :: ");
				choice = keyb.nextInt();
				System.out.println("=================================");
				System.out.println();
			}
			if (choice==1)
			{
				// cash
				System.out.print("Starting Amount :: ");
				cash = keyb.nextInt();
				// points
				round = 1;
				score = 0;
				choice = 0;
			}
		}
		// xp
		System.out.println("******************");
		System.out.println("*Congratulations!*");
		System.out.println("******************");
		System.out.println("      You are     ");
		System.out.println("!!!!!!!!!!!!!!!!!!");
		switch (score)
		{
			case 10:
				System.out.println("!!!!!a hacker!!!!!");
				break;
			case 9:
				System.out.println("!!a professional!!");
				break;
			case 8:
				System.out.println("!!!!!advanced!!!!!");
				break;
			case 7:
				System.out.println("!!!!!!!great!!!!!!");
				break;
			case 6:
				System.out.println("!!!!!!!good!!!!!!");
				break;
			case 5:
				System.out.println("!!!!!!!okay!!!!!!");
				break;
			case 4:case 3:case 2:case 1:case 0:
				System.out.println("!!!!an amateur!!!!");
				break;
		}
		System.out.println("!!!!!!!!!!!!!!!!!!");
	}
}