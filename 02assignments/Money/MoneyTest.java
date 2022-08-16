// NextDev65, 1/13/2020
class MoneyTest
{
	public static void main(String[] args)
	{
		Money m1 = new Money("123.4");
		m1.printMoney();
		Money m2 = new Money(".33");
		m2.printMoney();
		Money m3 = new Money("45");
		m3.printMoney();
		Money m4 = new Money("12.");
		m4.printMoney();		
	}
}