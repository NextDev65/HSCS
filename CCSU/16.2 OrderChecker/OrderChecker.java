import java.util.Scanner;
class OrderChecker
{
	public static void main(String[] args)
  {
  	Scanner keyb = new Scanner(System.in);
  	// bits & bots
  	final int boltsP = 5;
  	final int nutsP = 3;
  	final int washersP = 1;
  	System.out.print("Number of bolts: ");
	int bolts = keyb.nextInt();
	System.out.print("Number of nuts: ");
	int nuts = keyb.nextInt();
	System.out.print("Number of washers: ");
	int washers = keyb.nextInt();
	// checker
	if (nuts<bolts)
	{
		System.out.println("\nCheck the Order: too few nuts");
	}
	else if (washers<bolts*2)
	{
		System.out.println("\nCheck the Order: too few washers");
	}
	else
	{
		System.out.println("\nOrder is OK.");
	}
	// order
	System.out.print("\nTotal cost: " +((bolts*boltsP)+(nuts*nutsP)+(washers*washersP)));
  }
}