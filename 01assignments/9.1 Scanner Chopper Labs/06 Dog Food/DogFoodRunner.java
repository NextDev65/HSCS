//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main( String args[] )
	{
		DogFood doggo1 = new DogFood("6 10 14 18 25 32");
		out.println( doggo1.getAmount() );
		out.println(doggo1);

		DogFood doggo2 = new DogFood("12 15 20 26 35 42");
		out.println( doggo2.getAmount() );
		out.println(doggo2);

		DogFood doggo3 = new DogFood("33 38 45 51 60 65");
		out.println( doggo3.getAmount() );
		out.println(doggo3);

		DogFood doggo4 = new DogFood("40 50 60 77 90 101");
		out.println( doggo4.getAmount() );
		out.println(doggo4);
	}
}