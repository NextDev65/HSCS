class Arithmetic
{
  public static void main ( String[] args )
  {
  	System.out.println("        Arithmetic");
  	System.out.println("============================");
  	// nums
  	int num1 = 77;
  	int num2 = 32;
  	// operations
  	int sum = num1 + num2;
  	int difference = num1 - num2;
  	int product = num1 * num2;
  	int quotient = num1 / num2;
  	int remainder = num1 % num2;
  	// sum
  	System.out.println(num1+ " + " +num2+ " = " +sum);
  	// difference
  	System.out.println(num1+ " - " +num2+ " = " +difference);
  	// product
  	System.out.println(num1+ " * " +num2+ " = " +product);
  	// quotient
  	System.out.println(num1+ " / " +num2+ " = " +quotient);
  	// remainder
  	System.out.println(num1+ " % " +num2+ " = " +remainder);
  }
}