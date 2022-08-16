import java.util.Scanner;
class Seasons
{
  public static void main (String[] args )
  {
  	Scanner keyb = new Scanner(System.in);
  	// seasons
  	String spri = new String("Spring");
	String summ = new String("Summer");
	String fall = new String("Fall");
	String wint = new String("Winter");
  	System.out.print("Enter a Season --> ");
	String seas = keyb.nextLine();
	//
	if (seas.equalsIgnoreCase(spri))
	{
		System.out.println("Season: Spring");
		System.out.println("  Meteorological:");
		System.out.println("    March 20 - June 21");
		System.out.println("  Astronomical:");
		System.out.println("    Vernal Equinox - Summer Solstice");
	}
	else if (seas.equalsIgnoreCase(summ))
	{
		System.out.println("Season: Summer");
		System.out.println("  Meteorological:");
		System.out.println("    June 21 - September 22");
		System.out.println("  Astronomical:");
		System.out.println("    Summer Solstice - Autumnal  Equinox");
	}
	else if (seas.equalsIgnoreCase(fall))
	{
		System.out.println("Season: Fall");
		System.out.println("  Meteorological:");
		System.out.println("    September 22 - November 30");
		System.out.println("  Astronomical:");
		System.out.println("    Autumnal Equinox - Winter Solstice ");
	}
	else if (seas.equalsIgnoreCase(wint))
	{
		System.out.println("Season: Winter");
		System.out.println("  Meteorological:");
		System.out.println("    December 20 - March 20");
		System.out.println("  Astronomical:");
		System.out.println("    Winter Solstice - Vernal Equinox");
	}
	else
	{
		System.out.print("¦ERROR¦");
	}
  }
}