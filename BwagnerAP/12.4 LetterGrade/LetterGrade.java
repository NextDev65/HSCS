import java.util.Scanner;
class LetterGrade
{
  public static void main (String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// numg&&numgnitude
  	System.out.print("Enter a Numerical Grade--> ");
	double numg = keyb.nextDouble();
	// richter scale
	if (numg>100)
	{
		System.out.println("A++");
	}
	else if (97<=numg&&numg<=100)
	{
		System.out.println("Letter Grade = A+");
	}
	else if (94<=numg&&numg<=96)
	{
		System.out.println("Letter Grade = A");
	}
	else if (90<=numg&&numg<=93)
	{
		System.out.println("Letter Grade = A-");
	}
	else if (87<=numg&&numg<=89)
	{
		System.out.println("Letter Grade = B+");
	}
	else if (84<=numg&&numg<=86)
	{
		System.out.println("Letter Grade = B");
	}
	else if (80<=numg&&numg<=83)
	{
		System.out.println("Letter Grade = B-");
	}
	else if (77<=numg&&numg<=79)
	{
		System.out.println("Letter Grade = C+");
	}
	else if (74<=numg&&numg<=76)
	{
		System.out.println("Letter Grade = C");
	}
	else if (70<=numg&&numg<=73)
	{
		System.out.println("Letter Grade = C-");
	}
	else if (0<numg&&numg<70)
	{
		System.out.println("F");
	}
	else
	{
		System.out.println("?H?O?W?");
	}
  }
}