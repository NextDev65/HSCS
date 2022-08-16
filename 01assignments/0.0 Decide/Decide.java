import java.util.Scanner;
class FantasyGame
{
  public static void main (String[] args)
  {
    Scanner keyb = new Scanner( System.in );
    System.out.println("Welcome to Yertle's Quest");
    // name
    System.out.println("Enter the name of your character:");
    String name = new String (keyb.nextLine());
    // strength
    System.out.println("Enter strength (1-10):");
    int str = keyb.nextInt();
    // health
    System.out.println("Enter health (1-10):");
    int hp = keyb.nextInt();
    // luck
    System.out.println("Enter luck (1-10):");
    int lk = keyb.nextInt();
    // stats
    if (str+hp+lk>15)
    {
    	System.out.println("\nYou have given your character too many points!");
    	System.out.println("\nMax Default values have been assigned:");
    	System.out.println(name+ ", strength: 5, health: 5, luck: 5");
    }
    else
    {
    	System.out.println("Loading...");
    }
  }
}