//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover letterRemover = new LetterRemover("I am Sam I am", 'a');
		System.out.println(letterRemover);
		//add test cases
		letterRemover.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(letterRemover);
		letterRemover.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(letterRemover);
		letterRemover.setRemover("abababababa", 'b');
		System.out.println(letterRemover);
		letterRemover.setRemover("abaababababa", 'x');
		System.out.println(letterRemover);
	}
}