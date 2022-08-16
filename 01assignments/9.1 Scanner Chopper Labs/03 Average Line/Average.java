//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
	private String line;

	public Average()
	{
		setLine("");
	}

	public Average(String s)
	{
		line=s;
	}

	public void setLine(String s)
	{
		line=s;
	}

	public int getCount()
	{
		Scanner chopper = new Scanner(line);
		int count=0;
		while ( chopper.hasNextInt() )
		{
			chopper.nextInt();
			count++;
		}
		return count;
	}


	public int getSum()
	{
		Scanner chopper = new Scanner(line);
		int sum=0;
		while ( chopper.hasNextInt() )
		{
			sum += chopper.nextDouble();
		}
		return sum;
	}

	public double getAverage()
	{
		double average = 0.0;
		average = (double)getSum() / (double)getCount();
		return average;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine();
	}
}