import java.util.Scanner;
class RunofIntegers
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// start-end
		System.out.println("Enter Start:");
		int start = keyb.nextInt();
		System.out.println("Enter End:");
		int end = keyb.nextInt();
		System.out.println("");
		// run
		for (int ctr = start;ctr<=end;ctr++)
		{
			System.out.println(ctr);
		}
	}
}