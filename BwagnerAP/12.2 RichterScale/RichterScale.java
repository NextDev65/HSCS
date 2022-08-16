import java.util.Scanner;
class RichterScale
{
  public static void main (String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// magnitude
  	System.out.print("Enter a magnitude on the Richter scale ==>> ");
	double mag = keyb.nextDouble();
	// richter scale
	if (mag<=0)
	{
		System.out.println("This number is not valid.");
	}
	else if (mag>=8.0)
	{
		System.out.println("Most structures fall");
	}
	else if (mag>=7.0)
	{
		System.out.println("Most buildings destroyed");
	}
	else if (mag>=6.0)
	{
		System.out.println("Many buildings considerably damaged; some collapse");
	}
	else if (mag>=4.5)
	{
		System.out.println("Damage to poorly constructed buildings");
	}
	else if (mag>=3.5)
	{
		System.out.println("Felt by many people, no destruction");
	}
	else if (mag>0)
	{
		System.out.println("Generally not felt by people");
	}
  }
}