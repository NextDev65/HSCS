import java.util.Scanner;
class CircleArea
{
  public static void main ( String[] args )
  {
  	// radius
  	Scanner keyb = new Scanner(System.in);
	System.out.print("Input the radius: ");
	int r = keyb.nextInt();
	double A = Math.PI*r*r;
	System.out.print("The radius is: " +r+ " The area is: " +A);
  }
}