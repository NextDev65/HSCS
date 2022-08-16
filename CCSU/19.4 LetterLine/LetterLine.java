import java.util.Scanner;
class LetterLine
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// word
		System.out.print("Enter a word: ");
		String word = new String(keyb.nextLine());
		// index
		for (int index = 0;index<word.length();index++)
		{
			System.out.println(word.charAt(index));
		}
	}
}