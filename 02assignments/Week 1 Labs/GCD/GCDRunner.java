//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCDRunner
{
	public static void main ( String[] args )
	{
		GCD gcd = new GCD(5, 25);
		//add test cases
		out.println(gcd);
		gcd.setNums(4, 400);
		out.println(gcd);
		gcd.setNums(8, 80);
		out.println(gcd);
		gcd.setNums(15, 45);
		out.println(gcd);
		gcd.setNums(6, 66);
		out.println(gcd);
		gcd.setNums(9, 9);
		out.println(gcd);
		gcd.setNums(3, 543);
		out.println(gcd);
	}
}