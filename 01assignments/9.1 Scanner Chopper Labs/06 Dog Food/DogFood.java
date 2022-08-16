//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
	private double amount;

	public DogFood()
	{
		this("");
	}

	public DogFood(String line)
	{
		Scanner chopper = new Scanner(line);
		double cups = 0.0;
		for (int i = 0; i<6; i++)
		{
			int weight = chopper.nextInt();
			if(weight >= 2 && weight <= 4)
				cups += 0.5;
			else if(weight >= 5 && weight <= 7)
				cups += 1.0;
			else if(weight >= 8 && weight <= 9)
				cups += 1.5;
			else if(weight >= 10 && weight <= 19)
				cups += 2.0;
			else if(weight >= 20 && weight <= 39)
				cups += 3.5;
			else if(weight >= 40 && weight <= 59)
				cups += 4.5;
			else if(weight >= 60 && weight <= 79)
				cups += 6.0;
			else if(weight >= 80)
				cups += 7.5;
		}
		amount = Math.ceil( (cups*7)/60);
	}
	public double getAmount()
	{
		return amount;
	}

	public String toString()
	{
		return (int)getAmount() + " - 10 POUND BAGS\n";
	}
}