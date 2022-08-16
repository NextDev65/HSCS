//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class AverageRunner
{
	public static void main( String args[] )
	{
		// format
		String format1 = "###0.00" ;
	    DecimalFormat fm1 = new DecimalFormat(format1);

		Average test = new Average("9 10 5 20");
		out.println(test);
		out.println("average = "+fm1.format( test.getAverage() )+"\n\n");

		test.setLine("11 22 33 44 55 66 77");
		out.println(test);
		out.println("average = "+fm1.format( test.getAverage() )+"\n\n");

		test.setLine("48 52 29 100 50 29");
		out.println(test);
		out.println("average = "+fm1.format( test.getAverage() )+"\n\n");

		test.setLine("0");
		out.println(test);
		out.println("average = "+fm1.format( test.getAverage() )+"\n\n");

		test.setLine("100 90 95 98 100 97");
		out.println(test);
		out.println("average = "+fm1.format( test.getAverage() )+"\n\n");
	}
}