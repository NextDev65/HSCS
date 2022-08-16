import java.util.Scanner;
class CheckCharge
{
	public static void main (String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		System.out.print("balance in checking account :: ");
		double ch = keyb.nextDouble();
		System.out.print("balance in savings account :: ");
		double sav = keyb.nextDouble();
		System.out.print("number of checks :: ");
		int cks = keyb.nextInt();
		// service charge
		System.out.println("\nService Charge");
		System.out.println("--------------");
		if (ch>1000||sav>1500)
		{
			System.out.println("$0.00");
		}
		else
		{
			System.out.println("$" +cks*.15);
		}
	}
}