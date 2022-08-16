0import java.util.Scanner;
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
		Scanner scan = new Scanner(System.in);
		int ans = 1;
		//create Craps object
		Craps crap = new Craps();
		//outer loop
		while (ans == 1)
		{
			//get amount of money user has
			System.out.print("How much money are you starting with? ");
			int money = scan.nextInt();
			//setMoney(amount)
			crap.setMoney(money);
			//inner loop
			while (ans == 1 && crap.getMoney() > 0)
			{
				//bet
				crap.bet();
				//roll dice
				crap.rollDice();
				//get result
				crap.result();
				//tell user money left
				System.out.println("You have $" + crap.getMoney());
				//ask if they want to bet again
				System.out.print("Do you want to bet again? (1)yes (2)no ");
				ans  = scan.nextInt();
				//if yes, continue inner loop
			}
			//if no, ask if they want to start a new game
			System.out.print("Do you want to start a new game? (1)yes (2)no ");
			ans  = scan.nextInt();
			//if yes, continue outer loop
		}
		//if no, output money left
		System.out.println("You have $" + crap.getMoney());
		//end
		System.out.println("Thanks for playing!");
	}
}
