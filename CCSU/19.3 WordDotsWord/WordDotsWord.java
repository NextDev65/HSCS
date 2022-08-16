import java.util.Scanner;
class WordDotsWord
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// words
		System.out.println("Enter first word:");
		String word1 = new String(keyb.nextLine());
		System.out.println("Enter second word");
		String word2 = new String(keyb.nextLine());
		System.out.println("");
		// dots
		System.out.print(word1);
		for (int dot = 1;dot<=30-word1.length()-word2.length();dot++)
		{
			System.out.print(".");
		}
		System.out.println(word2);
	}
}