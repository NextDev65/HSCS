//(c) A+ Computer Science
// www.apluscompsci.com
//Name -
//Date -

public class HistogramRunner
{
	public static void main(String args[])
	{
		Histogram test = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3");
		System.out.println(test);

		test.setList("2 3 4 5 6 7 8 9 0 2 3 5 6 8 8 8 9 4 5");
		System.out.println(test);

		test.setList("7 7 7 7 7 7 7 7 5 6 7 8 2 0 2 3 5 1 2 3 4 5 6 5");
		System.out.println(test);
	}
}