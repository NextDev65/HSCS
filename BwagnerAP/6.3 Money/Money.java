import java.util.Scanner;
class Money
{
  public static void main ( String[] args )
  {
  	// gimme da cash
	Scanner keyb = new Scanner(System.in);
	System.out.print("dollars? :: ");
	int dollars = keyb.nextInt();
  	System.out.print("quarters? :: ");
  	int quarters = keyb.nextInt();
  	System.out.print("dimes? :: ");
	int dimes = keyb.nextInt();
	System.out.print("nickels? :: ");
	int nickels = keyb.nextInt();
	System.out.print("pennies? :: ");
	int pennies = keyb.nextInt();
  	// total
  	int totalCents = dollars + quarters*25 + dimes*10 + nickels*5 + pennies;
  	int D = totalCents/100;
  	int C = totalCents%100;
  	System.out.println("Total value = " +D+ " dollars and " +C+ " cents");
  }
}