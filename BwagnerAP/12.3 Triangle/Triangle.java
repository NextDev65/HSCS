import java.util.Scanner;
class Triangle
{
  public static void main (String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// nums
  	System.out.print("Enter Side 1 --> ");
	int num1 = keyb.nextInt();
	System.out.print("Enter Side 2 --> ");
	int num2 = keyb.nextInt();
	System.out.print("Enter Side 3 --> ");
	int num3 = keyb.nextInt();
	// triangulation
	if (num1==num2&&num2==num3)
	{
		System.out.println("This triangle is an equilateral");
	}
	else if (num1!=num2&&num1!=num3&&num2!=num3)
	{
		System.out.println("This triangle is a scalene");
	}
	else
	{
		System.out.print("This triangle is an isosceles");
	}
  }
}