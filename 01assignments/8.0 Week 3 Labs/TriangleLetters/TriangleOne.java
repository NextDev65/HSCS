//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle(String value, int big)
	{
		String output="";
		// loop i that runs num times
		for (int i = 1; i <= big; i++)
		{
		   // loop j
		   for (int j = 1; j <= i; j++)
		   {
		      output += value;
		   }
		   output += "\n";
		}
		return output;
	}
}