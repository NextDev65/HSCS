class AverageRainfall
{
  public static void main ( String[] args )
  {
  	// rainfall
  	int april = 12;
  	int may = 14;
  	int june = 8;
  	double month = 3.0;
  	double avg;
  	// calc
  	avg = (april+may+june)/month;
  	// output
  	System.out.println("Rainfall for April: "+april);
  	System.out.println("Rainfall for May  : "+may);
  	System.out.println("Rainfall for June : "+june);
  	System.out.println("-------------------------");
  	System.out.println("Average rainfall  : "+avg);
  }
}