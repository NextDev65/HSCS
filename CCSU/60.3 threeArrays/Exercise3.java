class Exercise3
{
	public static void main ( String[] args )
	{
		int[] valA   = { 13, -22,  82,  17};
		int[] valB   = {-12,  24, -79, -13};
		int[] sum    = {  0,   0,   0,   0};

		// Add values from corresponding cells of valA and valB
		// and put the result in the corresponding cell of sum.
		int i = 0;
		for (int value : valA)
		{
			sum[i] += value;
			i++;
		}
		i = 0;
		for (int value : valB)
		{
			sum[i] += value;
			i++;
		}

		System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	}
}