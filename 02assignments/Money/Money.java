// NextDev65, 1/13/2020
class Money
{
    // instance variable
    private String money;

    // constructor
    public Money(String m)
    {
        money = m;
    }

    // postcondition: returns the position of the first dot character
    //                in money or -1 if there is no dot in money
    private int findDot()
    {
       	return money.indexOf(".");
    }
    // precondition: money corresponds to a decimal number;
    //   i.e., it contains one of the following:
    //   (1) one or more digits
    //   (2) a dot followed by one or more digits, or
    //   (3) one or more digits followed by a dot,
    //       followed by zero or more digits
    public void printMoney()
    {
    	String dollars = "";
    	String cents = "";
    	if (findDot()==-1)
    	{
    		dollars = money;
    		cents = "0";
    	}
    	else if ( money.substring( 0,findDot() ).equals("") )
    	{
    		dollars = "0";
    		cents = money.substring( findDot()+1 );
    	}
    	else if ( money.substring( findDot()+1 ).equals("") )
    	{
    		dollars = money.substring( 0,findDot() );
    		cents = "0";
    	}
    	else
    	{
    		dollars = money.substring( 0,findDot() );
    		cents = money.substring( findDot()+1 );
    	}
    	System.out.println(dollars+ " dollars and " +cents+ " cents");
    }
}