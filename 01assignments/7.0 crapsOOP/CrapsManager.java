import java.util.*;
class CrapsManager
{
	public static void main(String[] args)
	{
		//  name
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
		//create Scanner
		Scanner keyb = new Scanner(System.in);
		//create Craps object
		Craps krap = new Craps();
		//outer loop
		do
		{
			//get amount of money user has
			System.out.print("Starting Amount :: ");
			int amount = keyb.nextInt();
			//setMoney(amount)
			krap.setMoney(amount);
			//inner loop
			int loop = 0;
			do
			{
				//bet
				System.out.print("bet :: ");
				int bet = keyb.nextInt();
				while (bet > krap.getMoney())
				{
					System.out.println("you need more $");
					System.out.println("cash :: " + krap.getMoney());
					System.out.println("=================================");
					System.out.print("bet :: ");
					bet = keyb.nextInt();
				}
				System.out.println("=================================");
				krap.bet(bet);
				//roll dice
				krap.rollDice();
				//get result
				krap.result();
				//tell user money left
				System.out.println("cash :: " + krap.getMoney());
				System.out.println("=================================");
				if (krap.getMoney() > 0)
				{
					//ask if they want to bet again
					int gamble;
					do
					{
						System.out.println("1 :: yes | 2 :: no");
						System.out.print("bet again ? :: ");
						gamble = keyb.nextInt();
						System.out.println("=================================");
					} while (gamble != 1 && gamble != 2);
					//if yes, continue inner loop
					if (gamble == 1)
						loop = 1;
					//if no, ask if they want to start a new game
					int newg;
					if (gamble == 2)
					{
						do
						{
							System.out.println("1 :: yes | 2 :: no");
							System.out.print("new game ? :: ");
							newg = keyb.nextInt();
							System.out.println("=================================");
						} while (newg != 1 && newg != 2);
						//if yes, continue outer loop
						if (newg == 1)
							loop = 0;
						//if no, output money left
						if (newg == 2)
						{
							System.out.println("P1's final cash :: " + krap.getMoney());
							System.out.println("=================================");
							krap.setMoney(0);
						}
					}
				}
				else
				{
					System.out.println("P1's final cash :: " + krap.getMoney());
					System.out.println("=================================");
					krap.setMoney(0);
				}
			} while (loop == 1 && krap.getMoney() > 0);
		//end
		} while (krap.getMoney() > 0);
	}
}
