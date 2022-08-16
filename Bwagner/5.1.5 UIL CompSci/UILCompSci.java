import java.util.*;

public class UILCompSci {
	private static Scanner keyboard = new Scanner(System.in);
	private static int skips;
	private static int score;
	
	public static String readString(String prompt) {
    	String x = "null";

    	System.out.print(prompt);
    	x = keyboard.nextLine();

    	return x;
    }
	public static int readInt(String prompt) {
    	int x = 0;

    	System.out.print(prompt);
    	x = keyboard.nextInt();
    	keyboard.nextLine();

    	return x;
    }
	public static int skips(int c, int i)
	{
		return 40 - c - i;
	}
	public static int score(int c, int i)
	{
		return (c*6)-(i*2);
	}
}