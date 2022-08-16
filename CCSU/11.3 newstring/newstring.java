class NewString
{
  public static void main ( String[] args )
  {
  	// first
	String first = new String("    In a Hole    in the ground there lived a Hobbit.   ");
	// second
	String second;
	second = first.trim();
	// output
    System.out.println(first);
    System.out.println(second);

  }
}