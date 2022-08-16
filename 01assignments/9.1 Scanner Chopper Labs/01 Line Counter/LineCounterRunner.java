//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounterRunner
{
   public static void main( String args[] )
   {
		LineCounter test = new LineCounter("9 10 5 20 1 2 3");
		out.println(test);
		out.println("count = "+test.getCount()+"\n\n");

		test.setLine("11 22 33 44 55 66 77 5 6 7");
		out.println(test);
		out.println("count = "+test.getCount()+"\n\n");

		test.setLine("48 52 29 100 50 293 4");
		out.println(test);
		out.println("count = "+test.getCount()+"\n\n");

		test.setLine("0");
		out.println(test);
		out.println("count = "+test.getCount()+"\n\n");

		test.setLine("100 90 95 98 100 97");
		out.println(test);
		out.println("count = "+test.getCount()+"\n\n");
	}
}