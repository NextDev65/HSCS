//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		boolean foundnum = false;
		for (int i = 0; i < ray.length; i++)
		{
    		if (ray[i] > ray[ray.length-1])
    			sum += ray[i];
    			foundnum = true;
		}
		if (ray.length == 0 || !foundnum)
			return -1;
		else
			return sum;
	}
}