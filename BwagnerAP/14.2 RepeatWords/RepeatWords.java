import java.util.Scanner;
class RepeatWords
{
	public static void main(String[] args)
	{
		// scanner
		Scanner keyb = new Scanner(System.in);
		// counter
		int ctr = 0;
		// word
		String word = new String("");
		System.out.println("Enter words, type (stop or exit) to stop: \n");
		// while
		while (!word.equalsIgnoreCase("stop") && !word.equalsIgnoreCase("exit"))
		{
			word = keyb.nextLine();
			ctr++;
		}
		System.out.println("\n"+"You entered " +(ctr-1)+ " word(s).");
	}
}