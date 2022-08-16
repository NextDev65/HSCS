class HelloObject
{
  private String greeting;

  public HelloObject( String st )
  {
    greeting = st;
  }
  /*
  public void speak()
  {
  	for (int i = 0; i < greeting.length(); i++)
  		System.out.println( greeting );
  }
  */
  public void speakAM()
  {
  	System.out.println( "Good Morning" );
  }
  public void speakPM()
  {
  	System.out.println( "Good Evening" );
  }
}


public class Good
{
  public static void main ( String[] args )
  {
    HelloObject anObject = new HelloObject("A Greeting!");
    anObject.speak();
  }
}