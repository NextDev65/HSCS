class Trigonometry
{
  public static void main ( String[] args )
  {
  	// trig
  	double o = 0.5236;
  	double a;
  	double b;
  	double c;
  	// calc
  	a = Math.sin(o);
  	b = Math.cos(o);
  	c = Math.pow(a,2)+Math.pow(b,2);
  	// output
  	System.out.println("a = sine(" +o);
  	System.out.println("b = cosine(" +o);
  	System.out.println("c = a^2 + b^2");
  	System.out.println("-----------------------------------------------------------");
  	System.out.println(c+ " = " +(Math.pow(a,2))+ " + " +(Math.pow(b,2)));
  }
}
