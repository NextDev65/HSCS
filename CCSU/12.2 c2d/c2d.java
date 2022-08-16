import java.util.Scanner;
class C2D
{
  public static void main ( String[] args )
  {
  	// gimme da cash
  	Scanner keyb = new Scanner(System.in);
	System.out.println("Input the cents:");
	int totalCents = keyb.nextInt();
	int dollars = totalCents/100;
	int cents = totalCents%100;
	System.out.print("That is  " +dollars+ " dollars and " +cents+ " cents.");
  }
}