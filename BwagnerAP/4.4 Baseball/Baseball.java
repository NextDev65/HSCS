class Baseball
{
  public static void main ( String[] args )
  {
  	// hits bats Avg
  	int hits = 27;
  	int atBats = 80;
  	double battingAvg = 0.0;
  	int roundedAvg = 0;
  	// calc
  	battingAvg = (double)hits / atBats;
  	battingAvg += 0.0005;
  	battingAvg *= 1000;
  	// round
  	roundedAvg = (int)battingAvg;
  	// output
  	System.out.println("Hits = " +hits);
  	System.out.println("At Bats = " +atBats);
  	System.out.println("-------------------------");
  	System.out.println("Batting Average(Rounded) = " +roundedAvg);
  }
}