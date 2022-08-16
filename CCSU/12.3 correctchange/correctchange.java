import java.util.Scanner;
class CorrectChange
{
  public static void main ( String[] args )
  {
  	// gimme da cash
  	Scanner keyb = new Scanner(System.in);
	System.out.print("change? :: ");
	int change = keyb.nextInt();
	// 1
	int dollars = change/100;
	int cents = change%100;
	// 4
	int quarters = cents/25;
	cents = cents%25;
	// 10
	int dimes = cents/10;
	cents = cents%10;
	// 20
	int nickels = cents/5;
	cents = cents%5;
	// change
	System.out.print("Your change is : " +dollars+ " dollar/s, " +quarters+ " quarter/s, " +dimes+ " dime/s, " +nickels+ " nickel/s, and " +cents+ " cents.");
  }
}