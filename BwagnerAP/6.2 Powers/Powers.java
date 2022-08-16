import java.util.Scanner;
class Powers
{
  public static void main ( String[] args )
  {
  	Scanner integer = new Scanner(System.in);
  	System.out.print("Please enter an integer--> ");
  	int i = integer.nextInt();
  	int square = i*i;
  	int cube = i*i*i;
  	int fourth = i*i*i*i;
  	System.out.println("The Square = " +square);
  	System.out.println("The Cube = " +cube);
  	System.out.println("The Fourth Power = " +fourth);
  }
}