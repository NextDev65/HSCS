class Payroll
{
  public static void main ( String[] args )
  {
    long   hoursWorked;
    double payRate, taxRate;
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}