//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetFirst
{
	//method go will return an array
	//containing all values > the first value in the array
	//from the array parameter ray
	public static int[] go(int[] ray)
	{
		int first = 0;
		int sum = 0;
		if (ray.length > 0)
		{
			int x = ray[0];

			for (int i = 0; i < ray.length; i++)
			{
				if(ray[i]>x)
				{
					sum++;
				}
			}
			int[] arr = new int[sum];
			int pos = 0;
			for (int i = 0; i < ray.length; i++)
			{
				if(ray[i]>x)
				{
					arr[pos] = ray[i];
					pos++;
				}
			}
			return arr;
		}
		int[] array = new int[0];
		return array;
	}
}