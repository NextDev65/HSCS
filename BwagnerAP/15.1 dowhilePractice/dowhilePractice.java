class dowhilePractice
{
	public static void main(String[] args)
	{
		// counter
		int ctr = 0;
		// while1
		do
		{
			System.out.print(ctr+ " ");
			ctr++;
		}
		while (ctr<=20);
		System.out.println("\n");
		// while2
		ctr = 1;
		do
		{
			System.out.print(ctr+ " ");
			ctr+=2;
		}
		while (ctr<=50);
		System.out.println("\n");
		// while3
		ctr = 0;
		do
		{
			System.out.print(ctr+ " ");
			ctr+=10;
		}
		while (ctr<=200);
		System.out.println("\n");
		// lowercase
		ctr = 97;
		do
		{
			System.out.print((char)ctr+ " ");
			ctr++;
		}
		while (ctr<=122);
		System.out.println();
	}
}