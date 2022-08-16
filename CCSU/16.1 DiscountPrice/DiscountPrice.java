import java.util.Scanner;
class DiscountPrice
{
	public static void main(String[] args)
  {
  	Scanner keyb = new Scanner(System.in);
  	// price (cents)
  	System.out.print("Enter amount of purchases:");
	int cents = keyb.nextInt();
	// comparison
	if (cents>1000)
	{
		System.out.println("Discounted price: " +(int)(cents*.9));
	}
	else
	{
		System.out.println("No Discount :(");
	}
  }
}