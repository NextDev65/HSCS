import java.util.Scanner;
class RepeatEchoWord
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// word
		System.out.println("Enter a word:");
		String word = new String(keyb.nextLine());
		System.out.println("");
		// echo
		for (int echo = 1;echo<=word.length();echo++)
		{
			System.out.println(word);
		}
	}
}