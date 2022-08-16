import java.util.Scanner;
class Craps
{
	//instance variables
	//money, bet, roll
	private int money;
	private int bet;
	private int tosserolle;
	//constructor
	public Craps()
	{
		this.money = 0;
		this.bet = 0;
		this.tosserolle = 0;
	}
	//method to set money
	public void setMoney(int money)
	{
		this.money = money;
	}
	//method to return amount of money
	public int getMoney()
	{
		return this.money;
	}
	//method to roll the dice
	public void rollDice()
	{
		tosserolle = (int)(Math.random() * 6) + 1 + (int)(Math.random() * 6) + 1;
	}
	//method to set bet
	public void bet()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your bet: ");
		this.bet = scan.nextInt();
		while (bet > money)
		{
			System.out.println("You can't bet more money than you have");
			System.out.println("Enter your bet: ");
			this.bet = scan.nextInt();
		}
	}
	//method to get result (win, lose, draw)
	public void result()
	{
		switch (tosserolle)
		{
			// win
			case 7: case 11:
				System.out.println("You won!");
				money += bet;
				break;
			// lose
			case 2: case 3: case 12:
				System.out.println("YOU LOSE!!!");
				money -= bet;
				break;
			// try again
			default:
				System.out.println("Draw");
		}
	}
}