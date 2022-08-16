import java.util.Scanner;
class Ohm
{
  public static void main ( String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// specs
	System.out.print("voltage? :: ");
	int V = keyb.nextInt();
	System.out.print("resistance? :: ");
	int R = keyb.nextInt();
	// current
	double I =(V+0.0)/R;
	System.out.print("current :: " +I+ " amp/s");
  }
}