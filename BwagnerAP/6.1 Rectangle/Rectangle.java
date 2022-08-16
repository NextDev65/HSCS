import java.util.Scanner;
class Rectangle
{
  public static void main ( String[] args )
  {
  	Scanner dimension = new Scanner(System.in);
  	System.out.print("Enter the Length --> ");
  	int L = dimension.nextInt();
  	System.out.print("Enter the Width --> ");
  	int W = dimension.nextInt();
  	int P = 2*L+2*W;
  	int A = L*W;
  	System.out.println("Perimeter = " +P);
  	System.out.println("Area = " +A);
  }
}