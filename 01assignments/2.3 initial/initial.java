class Initial
{
	public static void main(String[] args)
	{
		// name
		String first = new String("Jack");
		String middle = new String("Overland");
		String second = new String("Frost");
		System.out.println("My name is " +first+ " " +second);
		// initials
		String init1 = first.substring(0,1);
		String init2 = middle.substring(0,1);
		String init3 = second.substring(0,1);
		System.out.println("My initials are " +init1+ ". " +init2+ ". " +init3+ ".");
		// format
		String full = new String("Jack Frost");
		String init4 = full.substring(0,6);
		String init5 = full.substring(7,11);
		System.out.println(init5+ ", " +init4);
		// any name
		int any = full.indexOf(" ");
		String any1 = full.substring(0,any);
		String any2 = full.substring(any+1);
		System.out.println(any2+ ", " +any1);
	}
}