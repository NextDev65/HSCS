//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearchRunner
{
	public static void main( String args[] ) throws IOException
	{
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
			int find = 5;
			out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

			//add more case

			int[] array = {10, 30, 20, 40, 50, 15};
			int find = 5;
			out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

			int[] array = {3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65};
			int find = 5;
			out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

			int[] array = {100, 110, 1000, 25000, 65535};
			int find = 5;
			out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");
	}
}



