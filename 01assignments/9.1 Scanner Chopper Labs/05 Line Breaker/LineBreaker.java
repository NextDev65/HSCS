//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
	private String line;
	private int breaker;

	public LineBreaker()
	{
		this("",0);
	}

	public LineBreaker(String s, int b)
	{
		line=s;
		breaker=b;
	}

	public void setLineBreaker(String s, int b)
	{
		line=s;
		breaker=b;
	}

	public String getLine()
	{
		return line;
	}

	public String getLineBreaker()
	{
		String box ="";
		Scanner chopper = new Scanner(line);
		int count=0;
		while ( chopper.hasNext() )
		{
			box += chopper.next();
			count++;
				if(count>=breaker)
				{
					count = 0;
					box+="\n";
				}
		}
		return box;
	}

	public String toString()
	{
		return getLine();
	}
}