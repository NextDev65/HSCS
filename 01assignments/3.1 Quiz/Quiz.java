import java.util.Scanner;

class Quiz
{
  public static void main ( String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	
    // nums
  	System.out.println("enter 2 two-digit numbers::");
  	int num1 = keyb.nextInt();
  	int num2 = keyb.nextInt();
  	
    // sum
  	System.out.println(num1+num2);
  	if (num1+num2>100)
  	{
  		System.out.println("> 100");
  	}
  	else
  	{
  		System.out.println("<= 100");
  	}
  }
}