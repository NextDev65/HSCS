import java.util.Scanner;
class TirePressure
{
	public static void main (String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		// inflation
		boolean goodPressure = true;
		System.out.println("Input right front pressure");
		int rfp = keyb.nextInt();
		System.out.println("Input left front pressure");
		int lfp = keyb.nextInt();
		System.out.println("Input right rear pressure");
		int rrp = keyb.nextInt();
		System.out.println("Input left rear pressure");
		int lrp = keyb.nextInt();
		// is
		if (rfp!=lfp||rrp!=lrp)
			goodPressure = false;
		if (goodPressure==false)
			System.out.println("\nInflation is BAD");
		else
			System.out.println("\nInflation is OK");
	}
}