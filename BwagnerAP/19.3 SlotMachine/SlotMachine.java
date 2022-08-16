public class SlotMachine
{
    // constants
	public final int CHERRIES = 0;
	public final int APPLE = 1;
	public final int ORANGE = 2;
	public final int LEMON = 3;
	public final int BANANA = 4;

    // instance variables
	private int roller1;
	private int roller2;
	private int roller3;
	private int cash = 50;     // $50 is the amount of money you start with

    // methods

	/* This method randomly selects a fruit for each of the three rollers.
	 */
	public void pullLever()
	{
		roller1 = (int)(Math.random() * 5);
		roller2 = (int)(Math.random() * 5);
		roller3 = (int)(Math.random() * 5);
	}

	/* This method displays the type of fruit contained in each roller.
	 */
	public void displayRollers()
	{
		switch (roller1)
	    {
	    	case 0:
	    		System.out.print("Cherries ");
	    		break;
	    	case 1:
	    		System.out.print("Apple ");
	    		break;
	    	case 2:
	    		System.out.print("Orange ");
	    		break;
	    	case 3:
	    		System.out.print("Lemon ");
	    		break;
	    	case 4:
	    		System.out.print("Banana ");
	    		break;
	    }
	    switch (roller2)
	    {
	    	case 0:
	    		System.out.print("Cherries ");
	    		break;
	    	case 1:
	    		System.out.print("Apple ");
	    		break;
	    	case 2:
	    		System.out.print("Orange ");
	    		break;
	    	case 3:
	    		System.out.print("Lemon ");
	    		break;
	    	case 4:
	    		System.out.print("Banana ");
	    		break;
	    }
	    switch (roller3)
	    {
	    	case 0:
	    		System.out.println("Cherries");
	    		break;
	    	case 1:
	    		System.out.println("Apple");
	    		break;
	    	case 2:
	    		System.out.println("Orange");
	    		break;
	    	case 3:
	    		System.out.println("Lemon");
	    		break;
	    	case 4:
	    		System.out.println("Banana");
	    		break;
	    }
	}
	/* This method determines the amount of pay off when there is a winner
	 * @ return the amount of payoff
	 */
	private int getPayOff()
	{
		int rand = (int)(Math.random() * 10);
		// PayOff
		if (rand >= 0 && rand < 6)
			return (int)(Math.random() * 10)+1;
		else if (rand >= 6 && rand < 9)
			return (int)(Math.random() * 90)+11;
		else
			return 10000;
	}

	/* This method displays the results of pulling the lever.
	 */
	public void displayResults()
	{
		cash--;
		if (cash == 0)
			System.out.println("Go home you are broke!");
		else if ((roller1 == roller2) && (roller2 == roller3))
		{
			int payoff = getPayOff();
			cash += payoff;
			System.out.println("************************");
			System.out.println("         Winner         ");
			System.out.println("************************");
			System.out.println();
			System.out.println("You won $" + payoff);
		}
		else
		{
			System.out.println("No winner. Please try again.");
		}
		System.out.println("cash = $ " + cash);
	}
}