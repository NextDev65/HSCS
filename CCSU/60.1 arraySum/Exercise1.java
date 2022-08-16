class Exercise1
{
	public static void main ( String[] args )
	{
		int[] val = {0, 1, 2, 3};

		int sum = 0;

		for (int value : val)
			sum+=value;

		System.out.println( "Sum of all numbers = " + sum );
	}
}