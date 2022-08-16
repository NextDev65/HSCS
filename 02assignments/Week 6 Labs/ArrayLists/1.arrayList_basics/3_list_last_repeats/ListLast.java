
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
		int x = 0;
		for (int num : ray)
			if (num == ray.get(ray.size()-1))
				x++;
		if (x >= 2)
			return true;
		return false;
	}
}