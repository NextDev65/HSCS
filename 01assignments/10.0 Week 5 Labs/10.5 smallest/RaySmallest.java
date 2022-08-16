//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		double smallest = Double.MAX_VALUE;
		for(int i : ray)
		{
			if (i<smallest)
				smallest = i;
		}
		return (int)smallest;
	}
}