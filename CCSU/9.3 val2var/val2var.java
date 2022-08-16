class Val2Var
{
  public static void main ( String[] args )
  {
    double x = 1.0;
    double value = 3*(x*x)-8*x+4;
    System.out.println("At x = " +x+ " the value is " +value);
    x = 2.0;
    value = 3*(x*x)-8*x+4;
    System.out.println("At x = " +x+ " the value is " +value);
    x = 3.0;
    value = 3*(x*x)-8*x+4;
    System.out.println("At x = " +x+ " the value is " +value);
  }
}