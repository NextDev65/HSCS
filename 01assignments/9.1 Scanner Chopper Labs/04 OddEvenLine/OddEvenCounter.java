//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

	public OddEvenCounter()
	{
		setLine("");
	}

	public OddEvenCounter(String s)
	{
		line=s;
	}

	public void setLine(String s)
	{
		line=s;
	}

	public int getEvenCount()
	{
		Scanner chopper = new Scanner(line);
		int count=0;
		while ( chopper.hasNextInt() )
		{
			if ( chopper.nextInt() % 2 == 0)
				count++;
		}
		return count;
	}

	public int getOddCount()
	{
		Scanner chopper = new Scanner(line);
		int count=0;
		while ( chopper.hasNextInt() )
		{
			if ( chopper.nextInt() % 2 == 1)
				count++;
		}
		return count;
	}

	public String toString( )
	{
		return line;
	}
}