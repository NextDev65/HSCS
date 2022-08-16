import java.util.*;

public class WordList
{
    public void list()
    {

    	String[] read = new String[10];
    	Scanner chopper = new Scanner(System.in);
    	// readloop
    	for(int spot=0; spot<10; spot++)
		{
			read[spot] = chopper.next();
		}
		System.out.println();
		// printloop
    	for(int spot=0; spot<read.length; spot++)
		{
		    System.out.println(read[spot]);
		}
    }

    public static void main(String[] args)
    {
       WordList app = new WordList();
       System.out.println("Enter 10 words:");
       app.list();
    }
}