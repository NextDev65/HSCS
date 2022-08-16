//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*;

public class WordSortRunner
{
	public static void main(String args[])
	{
		//add test cases
		WordSort words = new WordSort("abc ABC 12321 fred alexander");
		words.sort();
		System.out.println(words);

		words = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		words.sort();
		System.out.println(words);

		words = new WordSort("b x 4 r s y $");
		words.sort();
		System.out.println(words);

		words = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		words.sort();
		System.out.println(words);
	}
}