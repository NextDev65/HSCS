public class HelloWorld
{
	private String x;
	
	public HelloWorld(String word) 
	{
		x = word;
    }
	
	public String toString() 
    { 
        return x; 
    } 
	
	public static void main(String args[]) 
	{
		HelloWorld hw = new HelloWorld("Hello World");
		System.out.println(hw);
	}
}
