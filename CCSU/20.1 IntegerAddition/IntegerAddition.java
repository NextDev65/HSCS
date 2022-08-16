import java.util.Scanner;
class IntegerAddition
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// add
		System.out.println("How many integers will be added:");
		int add = keyb.nextInt();
		int sum = 0;
		// addend
		for (int adds = 1;adds<=add;adds++)
		{
			System.out.println("Enter an integer:");
			sum += keyb.nextInt();
		}
		System.out.println("The sum is " +sum);
	}
}