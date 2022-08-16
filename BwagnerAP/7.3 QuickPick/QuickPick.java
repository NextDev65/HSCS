import java.util.Scanner;
class QuickPick
{
  public static void main ( String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// nums
	int num1 = (int)(Math.random()*50)+1;
	int num2 = (int)(Math.random()*50)+1;
	int num3 = (int)(Math.random()*50)+1;
	int num4 = (int)(Math.random()*50)+1;
	int num5 = (int)(Math.random()*50)+1;
	int num6 = (int)(Math.random()*50)+1;
	// qp
	System.out.println("Texas Lottery - Quick Pick");
	System.out.println("==========================");
	System.out.println(num1+ " " +num2+ " " +num3+ " " +num4+ " " +num5+ " " +num6);
  }
}