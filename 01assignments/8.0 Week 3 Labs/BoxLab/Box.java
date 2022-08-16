//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
   private int size;

	public Box()
	{
		size = 0;
	}

	public Box(int count)
	{
		setSize(count);
	}

	public void setSize(int count)
	{
		size = count;
	}

	public int getSize()
	{
		return size;
	}

	public String toString()
	{
		String output="";
		// loop i that runs num times
		for (int i = 0; i < size; i++)
		{
		   // loop j
		   for (int j = i; j < size; j++)
		   {
		      output += "*";
		   }

		   // loop k
		   for (int k = i; k >= 0; k--)
		   {
		      output += "#";
		   }
		   output += "\n";
		}
		return output;
	}
}