import java.util.Scanner;
class Initial
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		// enter
		System.out.println("Enter a string:");
		String usrstr = keyb.nextLine();
		System.out.print("Enter beginning index: ");
		int bi = keyb.nextInt();
		System.out.print("Enter ending index: ");
		int ei = keyb.nextInt();
		// original
		System.out.println("\nOriginal string:\n"+usrstr);
		// substring
		String subs = usrstr.substring(bi,ei);
		System.out.println("\nSubstring:\n"+subs);
	}
}