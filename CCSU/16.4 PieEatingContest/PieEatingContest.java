import java.util.Scanner;
class PieEatingContest
{
	public static void main(String[] args)
  {
  	Scanner keyb = new Scanner(System.in);
  	// weight (pounds)
  	System.out.print("contestant's weight:");
	double lbs = keyb.nextDouble();
	// pec heavyweight division
	if (220<=lbs&&lbs<=280)
	{
		System.out.println("the contestant is allowed in the contest");
	}
	else
	{
		System.out.println("contestant? - not anymore.");
	}
  }
}