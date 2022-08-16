import java.util.Scanner;
class MinMax
{
  public static void main ( String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// ints
	System.out.print("Enter 1st Integer --> ");
	int int1 = keyb.nextInt();
	System.out.print("Enter 2nd Integer --> ");
	int int2 = keyb.nextInt();
	System.out.print("Enter 3rd Integer --> ");
	int int3 = keyb.nextInt();
	// mins
	int min1 = Math.min(int1,int2);
	int min2 = Math.min(min1,int3);
	// maxs
	int max1 = Math.max(int1,int2);
	int max2 = Math.max(max1,int3);
	System.out.println("\nSmallest = " +min2);
	System.out.println("Largest =  " +max2);
  }
}