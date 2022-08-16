import java.io.* ;

class TwoLargest
{

	public static void main ( String[] args )
	{
	int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

	// declare and initialize variables for the two largest
	int one = Integer.MIN_VALUE;
	int two = Integer.MIN_VALUE;

	// compute the two largest

	for (int val : data)
	{
		if (val > one)
		{
			two = one;
			one = val;
		}
		else if (val > two)
			two = val;
	}

	// write out the two largest
	System.out.println(one);
	System.out.println(two);
	}
}