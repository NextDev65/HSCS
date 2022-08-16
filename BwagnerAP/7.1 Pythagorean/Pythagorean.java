import java.util.Scanner;
class Pythagorean
{
  public static void main ( String[] args )
  {
  	// a & b
	Scanner keyb = new Scanner(System.in);
	System.out.print("Enter side 1 -->");
	int a = keyb.nextInt();
	System.out.print("Enter side 2 -->");
	int b = keyb.nextInt();
	// c
	double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	System.out.println("\nThe hypotenuse of the triangle = " +Math.round(c));
  }
}