import java.util.Scanner;
class CharacterCounter
{
  public static void main (String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// I
  	System.out.println("input :: ");
  	String input = new String(keyb.nextLine());
  	input = input.toLowerCase();
	// /
	int cons = 0;
	int vowe = 0;
	int punc = 0;
	int spac = 0;
	int numb = 0;
	boolean basic = true;
	for (int inout = 0;inout<input.length();inout++)
	{
		switch (input.charAt(inout))
		{
			// consonants
			case 'b':case 'c':case 'd':case 'f':case 'g':case 'h':case 'j':case 'k':case 'l':case 'm':case 'n':case 'p':case 'q':case 'r':case 's':case 't':case 'v':case 'w':case 'x':case 'y':case 'z':
				cons++;
				break;
			// vowels
			case 'a':case 'e':case 'i':case 'o':case 'u':
				vowe++;
				break;
			// punctuation
			case '!':case '@':case '#':case '%':case '&':case '?':case ',':case '.':case ':':case ';':case '/':case '(':case ')':case '"':case '-':case '_':
				punc++;
				break;
			// spaces
			case ' ':
				spac++;
				break;
			// numbers
			case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':
				numb++;
				break;
			default:
				basic=false;
		}
	}
	// O
	System.out.println();
	if (basic)
	{
		System.out.println("consonants :: " +cons);
		System.out.println("vowels :: " +vowe);
		System.out.println("punctuation :: " +punc);
		System.out.println("spaces :: " +spac);
		System.out.println("numbers :: " +numb);
	}
	else
		System.out.println("ERROR :: too complex!");
  }
}