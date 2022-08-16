class D2R
{
  public static void main ( String[] args )
  {
  	// trig
  	double rad;
  	double deg = 30;
  	// calc
  	rad = deg * Math.PI/180;
  	deg = rad * 180/Math.PI;
  	// output
  	System.out.println("Radians: " +rad);
  	System.out.println("Degrees: " +deg);
  }
}
