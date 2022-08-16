import java.util.Scanner;
import java.io.*;

public class Integers
{
	public static void main (String[] args) throws IOException
	{
	// Scanner for keyb input
	Scanner keyb = new Scanner( System.in );

	// prepare the input file
	System.out.print("Input File Name: ");
	String inputFileName = keyb.nextLine().trim();
	Scanner input = new Scanner( new File(inputFileName) );

	// prepare the output file
	System.out.print("Output File Name (odd integers): ");
	String outputOdd = keyb.nextLine().trim();
	PrintWriter odd = new PrintWriter( new FileWriter(outputOdd) );

	System.out.print("Output File Name (even integers): ");
	String outputEven = keyb.nextLine().trim();
	PrintWriter even = new PrintWriter( new FileWriter(outputEven) );

	// processing loop
	while( input.hasNextInt() )
	{
		int num = input.nextInt();
		//odd
		if (num%2 == 1)
			odd.println(num);
		//even
		else
			even.println(num);
	}

	// close the files
	input.close();
	odd.close();
	even.close();
	}
}