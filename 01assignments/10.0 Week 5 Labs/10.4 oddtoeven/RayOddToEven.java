//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int positionO;
		int positionE;
		int go = 0;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i]%2 != 0)
			{
				positionO = i;
				for (int x = i; x < ray.length; x++)
				{
					if (ray[x]%2 == 0)
					{
						positionE = x;
						go = positionE - positionO;
						return go;
					}
				}
			}
		}
		if (go == 0)
			return -1;
		else
			return go;
	}
}