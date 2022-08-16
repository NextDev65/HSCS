import java.util.Scanner;
class MoreTirePressure
{
	public static void main (String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		// inflation
		boolean goodPressure = true;
		// rfp
		System.out.println("Input right front pressure");
		int rfp = keyb.nextInt();
		if (rfp<=35||rfp>=45)
		{
			goodPressure = false;
			System.out.println("Warning: pressure is out of range");
		}
		// lfp
		System.out.println("Input left front pressure");
		int lfp = keyb.nextInt();
		if (lfp<=35||lfp>=45)
		{
			goodPressure = false;
			System.out.println("Warning: pressure is out of range");
		}
		// rrp
		System.out.println("Input right rear pressure");
		int rrp = keyb.nextInt();
		if (rrp<=35||rrp>=45)
		{
			goodPressure = false;
			System.out.println("Warning: pressure is out of range");
		}
		// lrp
		System.out.println("Input left rear pressure");
		int lrp = keyb.nextInt();
		if (lrp<=35||lrp>=45)
		{
			goodPressure = false;
			System.out.println("Warning: pressure is out of range");
		}
		// is
		if (rfp==lfp&&rrp==lrp&&goodPressure)
			System.out.println("\nInflation is OK");
		else
			System.out.println("\nInflation is BAD");
	}
}