import java.util.Scanner;
class StarWedge4
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// wedge
		System.out.print("number of wedges:: ");
		int wedge = keyb.nextInt();
		System.out.println("");
		int stage = wedge;
		// wedge
		while (wedge>=1)
		{
			// space
			for (int space = stage;space>wedge;space--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			wedge--;
			int star = wedge;
			while (star>=1)
			{
				System.out.print("*");
				star--;
			}
			System.out.println("");
		}
	}
}
