//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int total = 0;
		int first = ray.get(0);
		boolean counted = false;
		for (int num : ray)
			if (num > ray.get(0))
				total += num;
		if (total == 0)
			return -1;
		return total;
	}
}