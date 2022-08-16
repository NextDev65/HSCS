import java.util.Scanner;
class AnnualApplianceCost
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		// kilowatt-hour
		System.out.println("Enter cost per kilowatt-hour  in cents");
		double cost = keyb.nextDouble();
		System.out.println("Enter kilowatt-hours used per year");
		double kh = keyb.nextDouble();
		// annual appliance cost
		System.out.println("Annual cost: " +(cost*kh)/100);
	}
}