import java.util.Scanner;
class MicrowaveOven
{
  public static void main (String[] args)
  {
    Scanner keyb = new Scanner( System.in );
    // items
    System.out.print("number of items:: ");
    int items = keyb.nextInt();
    // time
    System.out.print("single-item heating time:: ");
    double time = keyb.nextDouble();
    // recommended heating time
    if (items==1)
    {
    	System.out.println("\nrecommended heating time:: " +time);
    }
    if (items==2)
    {
    	System.out.println("\nrecommended heating time:: " +(time*1.5));
    }
    if (items==3)
    {
    	System.out.println("\nrecommended heating time:: " +(time*2.0));
    }
    if (items>3)
    {
    	System.out.println("\nHeating more than three items at once is not recommended.");
    }
  }
}