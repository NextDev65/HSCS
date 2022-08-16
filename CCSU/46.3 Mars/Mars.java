import java.util.Scanner;
class HelloObject
{
  private String greeting;

  public HelloObject( String st )
  {
    greeting = st;
  }
  public void speak()
  {
  	System.out.println( greeting );
  }
}


public class Mars
{
  public static void main ( String[] args )
  {
  	Scanner scan = new Scanner(System.in);
  	System.out.print("Enter a Greeting: ");
  	String greeting = scan.nextLine();
    HelloObject anObject = new HelloObject(greeting);
    anObject.speak();
  }
}