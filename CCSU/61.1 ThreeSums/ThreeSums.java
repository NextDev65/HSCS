import java.io.* ;

class ThreeSums
{
	public static void main ( String[] args )
	{
		int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

		// declare and initialize three sums
		int even = 0;
		int odd = 0;
		int all = 0;

		// compute the sums
		for ( int index=0; index < data.length; index++)
		{
			switch ( data[index] % 2 )
			{
				case 0:
					even += data[index];
					break;
				case 1:
					odd += data[index];
					break;
			}
			all += data[index];
		}

		// write out the three sums
		System.out.println(even);
		System.out.println(odd);
		System.out.println(all);
	}
}