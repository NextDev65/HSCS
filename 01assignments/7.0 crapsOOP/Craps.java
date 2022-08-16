import java.util.*;
class Craps
{
	//instance variables
	//money, bet, roll
	private int money;
	private int bet;
	private int toss;
	private int roll;
	//constructor
	public Craps()
	{
		this.money = 0;
		this.bet = 0;
		this.toss = 0;
		this.roll = 0;
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
		Random rand = new Random();
		// toss
		toss = rand.nextInt(6)+1;
		System.out.println("P1 tossed a " +toss);

		// d
		// i
		// s
		// t
		// a
		// n
		// c
		// e
		// (for rand seed variation)

		// roll
		roll = rand.nextInt(6)+1;
		System.out.println("P1 rolled a " +roll);
	}
	//method to set bet
	public void bet(int bet)
	{
		this.bet = bet;
	}
	//method to get result (win, lose, draw)
	public void result()
	{
		switch (toss + roll)
		{
			// win
			case 7:
				money += bet;
				System.out.println("sum is " +(toss+roll));
				System.out.println("YOU WIN!!!");
				break;
			case 11:
				money += bet;
				System.out.println("sum is " +(toss+roll));
				System.out.println("YOU WIN!!!");
				break;
			// lose
			case 2:
				money -= bet;
				System.out.println("sum is " +(toss+roll));
				System.out.println("YOU LOSE!!!");
				break;
			case 3:
				money -= bet;
				System.out.println("sum is " +(toss+roll));
				System.out.println("YOU LOSE!!!");
				break;
			case 12:
				money -= bet;
				System.out.println("sum is " +(toss+roll));
				System.out.println("YOU LOSE!!!");
				break;
			// try again
			default:
				System.out.println("sum is " +(toss+roll));
				System.out.println("(try again)");
				break;
		}
	}
}