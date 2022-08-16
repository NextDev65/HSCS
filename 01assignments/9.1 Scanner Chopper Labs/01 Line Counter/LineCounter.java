//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
	private String line;
	public LineCounter()
	{
		setLine("");
	}

	public LineCounter(String s)
	{
		line = s;
	}

	public void setLine(String s)
	{
		line = s;
	}

	public int getCount()
	{
		int count=0;
		Scanner chopper = new Scanner(line);
		while ( chopper.hasNextInt() )
		{
			System.out.print(chopper.nextInt() + " ");
			count++;
		}
		System.out.println();
		return count;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return getLine();
	}
}