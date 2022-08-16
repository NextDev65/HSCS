import java.util.Scanner;
class StarWedge1
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// wedge
		System.out.print("number of wedges:: ");
		int wedge = keyb.nextInt();
		System.out.println("");
		// star
		while (wedge>=1)
		{
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