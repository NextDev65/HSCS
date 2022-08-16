import java.util.Scanner;
class StarWedge3
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
			for (int space = 1;space+1<=wedge;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			wedge--;
			// star
			for (int star = wedge;star+1<stage;star++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}