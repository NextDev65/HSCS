import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
	public static void main( String args[] )
	{
		OddEvenCounter test = new OddEvenCounter("9 10 5 20");
		out.println(test);
		out.println("even count = "+test.getEvenCount() );
		out.println("odd count = "+test.getOddCount()+"\n");

		test.setLine("11 22 33 44 55 66 77");
		out.println(test);
		out.println("even count = "+test.getEvenCount() );
		out.println("odd count = "+test.getOddCount()+"\n");

		test.setLine("3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6");
		out.println(test);
		out.println("even count = "+test.getEvenCount() );
		out.println("odd count = "+test.getOddCount()+"\n");

		test.setLine("2 4 6 8 2 4 6");
		out.println(test);
		out.println("even count = "+test.getEvenCount() );
		out.println("odd count = "+test.getOddCount()+"\n");

		test.setLine("1 3 5 7 9 1 3 5");
		out.println(test);
		out.println("even count = "+test.getEvenCount() );
		out.println("odd count = "+test.getOddCount()+"\n");
	}
}