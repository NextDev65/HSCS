//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		int[] newArray = new int[3];
		int pos = 0;
		for (int i = 0; i < ray.length; i++)
		{
			if(ray[i] > 11)
			{
				newArray[pos] = ray[i];
				pos++;
			}
		}
		return newArray;
	}
}