import java.util.Scanner;
public class PlaySlots
{
	public static void main (String[] args )
	{
		SlotMachine casinoroyale = new SlotMachine();
		Scanner keyb = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("1. Pull Lever 2. Quit -->");
			choice = keyb.nextInt();
			if (choice == 1)
			{
				casinoroyale.pullLever();
				casinoroyale.displayRollers();
				casinoroyale.displayResults();
			}
		} while (choice == 1);
	}
}