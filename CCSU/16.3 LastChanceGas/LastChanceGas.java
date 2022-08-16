import java.util.Scanner;
class LastChanceGas
{
	public static void main(String[] args)
  {
  	Scanner keyb = new Scanner(System.in);
  	// gasoline
  	System.out.println("Tank capacity:");
	int tank = keyb.nextInt();
	System.out.println("Gauge reading:");
	int gauge = keyb.nextInt();
	System.out.println("Miles per gallon:");
	int mpg = keyb.nextInt();
	// last chance
	if (tank*(gauge/100.0)*mpg<200)
	{
		System.out.print("Get Gas!");
	}
	else
	{
		System.out.println("Don't Stop");
	}
  }
}