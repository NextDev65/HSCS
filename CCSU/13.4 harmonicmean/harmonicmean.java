import java.util.Scanner;
class HarmonicMean
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		// X & Y
		System.out.println("Enter X:");
		double X = keyb.nextDouble();
		System.out.println("Enter Y:");
		double Y = keyb.nextDouble();
		// Arithmetic
		System.out.println("Arithmetic mean: " +(X+Y)/2);
		// Harmonic
		System.out.println("Harmonic   mean: " +2/(1/X+1/Y));
	}
}