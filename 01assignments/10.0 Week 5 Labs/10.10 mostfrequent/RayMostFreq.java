//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayMostFreq
{
	//method go will return the value
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
		int largestCount = 0;
		int mostNum = 0;
		int count = 0;
		for (int i = 0; i < ray.length; i++)
		{
			for (int j = i + 1; j < ray.length; j++)
			{
				if (ray[i] == ray[j])
					count++;
			}
			if (count > largestCount)
			{
				largestCount = count;
				mostNum = ray[i];
			}
			count = 0;
		}
		return mostNum;
	}
}