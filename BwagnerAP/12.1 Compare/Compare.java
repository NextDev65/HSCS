import java.util.Scanner;
class Compare
{
  public static void main (String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// nums
  	System.out.print("Enter Number 1 --> ");
	int num1 = keyb.nextInt();
	System.out.print("Enter Number 2 --> ");
	int num2 = keyb.nextInt();
	// comparison
	if (num1<num2)
	{
		System.out.println(num1+ " is less than " +num2);
	}
	else if (num1>num2)
	{
		System.out.println(num1+ " is greater than " +num2);
	}
	else if (num1==num2)
	{
		System.out.println(num1+ " is equal to " +num2);
	}
	else
	{
		System.out.println("¦ERROR¦");
	}
  }
}