import java.util.*;

public class ChangeCase
{
	// instance variables
	private String[] words = new String[50];  // array's physical size
	private int size = 0;                     // array's logical size
	private Scanner keyboard = new Scanner(System.in);

	/* Reads strings input from the keyboard and stores them in the array words.
	* Input continues until the user types "stop".
	* The logical size of the array is. incremented each time a new string
	*    is added to the array.
	*/
	public void readWords()
	{
		String str = "";
		while ( !str.equals("stop") )
		{
			str = keyboard.nextLine();
			words[size] = str;         // size = logical size of the array
			size++;
		}
	}

	/* Prints each word in the array three times. Once in its original form,
	* once in all capital letters, and once in all lowercase letters.
	*/
	public void printWords()
	{
		for (int i=0; i<size-1; i++)
		{
			String str = words[i];
			System.out.println(str +" "+ str.toUpperCase() +" "+ str.toLowerCase() );
		}
	}

	public static void main(String[] args)
	{
		ChangeCase app = new ChangeCase();
		app.readWords();
		app.printWords();
	}
}