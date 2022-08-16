//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int found = Integer.MAX_VALUE;
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i]>searchNum && numArray[i]<found)
				found = numArray[i];
		}
		return found;
	}
}