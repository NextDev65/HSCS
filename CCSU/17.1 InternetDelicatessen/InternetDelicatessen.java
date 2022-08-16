import java.util.Scanner;
class InternetDelicatessen
{
  public static void main (String[] args)
  {
    Scanner keyb = new Scanner( System.in );
    // item
    System.out.print("Enter the item: ");
    String item = new String (keyb.nextLine());
    // price
    System.out.print("Enter the price: ");
    double price = keyb.nextDouble();
    // delivery
    System.out.print("Overnight delivery (0==no, 1==yes): ");
    int overnight = keyb.nextInt();
    // overnight/deliv
    double deliv = 0;
    if (price<10)
    {
    	deliv = deliv + 2.0;
    }
    if (overnight==1)
    {
    	deliv = deliv + 3.0;
    }
    System.out.println("\nInvoice:");
    System.out.println("\t" +item+ "\t" +price);
    System.out.println("\tdelivery\t" +deliv);
    System.out.println("\ttotal\t" +(price+deliv));
  }
}