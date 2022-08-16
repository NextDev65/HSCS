import java.util.Scanner;

public class Vowels {
	private	String[] words = new String[10];
	private Scanner w = new Scanner(System.in);

	public void	tenWords() {
		System.out.println("Enter 10 words:");
		for	(int i = 0;	i <	10; i++)
		{
			System.out.print("Word " +(i+1)+ "-->");
			words[i] = w.nextLine();


		}
	}
	public void countVowels()
	{
		int vowelCount;
		for (String word : words)
		{
			vowelCount = 0;
			for (char letter : word.toCharArray())
			{
				if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' )
		        	vowelCount++;
			}
			System.out.println(word+ " - " +vowelCount);
		}
	}
	public static void main(String[] args) {
		Vowels vowel = new Vowels();
		vowel.tenWords();
		vowel.countVowels();
	}
}