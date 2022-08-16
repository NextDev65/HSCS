//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		System.out.print(test.toString());
		test.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.print("\n" + test.toString());
		test.setList("a b x 4 r s y $");
		System.out.print("\n" + test.toString());
		test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.print("\n" + test.toString());
	}
}