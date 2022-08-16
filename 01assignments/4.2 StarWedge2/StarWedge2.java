import java.util.Scanner;
class StarWedge2
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// wedge
		System.out.print("number of wedges:: ");
		int wedge = keyb.nextInt();
		System.out.println("");
		// stage
		int stage = wedge;
		while (wedge>=1)
		{
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