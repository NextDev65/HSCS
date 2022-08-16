//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
	public static void main( String args[] )
	{
		LineTotaller test = new LineTotaller("1 2 3 4 5 6");
		out.println(test);
		out.println("sum = "+test.getSum()+"\n\n");

		test.setLine("10 20 30 40 50 60");
		out.println(test);
		out.println("sum = "+test.getSum()+"\n\n");

		test.setLine("250 657 2154 345 6796");
		out.println(test);
		out.println("sum = "+test.getSum()+"\n\n");

		test.setLine("0");
		out.println(test);
		out.println("sum = "+test.getSum()+"\n\n");

		test.setLine("-99 45 -98 92 87");
		out.println(test);
		out.println("sum = "+test.getSum()+"\n\n");
	}
}