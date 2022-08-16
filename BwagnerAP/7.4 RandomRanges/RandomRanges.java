class RandomRanges
{
  public static void main ( String[] args )
  {
  	// nums
	int num1 = (int)(Math.random()*26);
	int num2 = (int)(Math.random()*3)+1;
	int num3 = (int)(Math.random()*51)+50;
	int num4 = (int)(Math.random()*-10)-1;
	int num5 = (int)(Math.random()*201)-100;
	int num6 = (int)(Math.random() * 26) + 65;
	// qp
	System.out.println("Random Ranges - Quick Pick");
	System.out.println("==========================");
	System.out.println(num1+ " " +num2+ " " +num3+ " " +num4+ " " +num5+ " " +(char)num6);
  }
}