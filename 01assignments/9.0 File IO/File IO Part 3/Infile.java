import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Infile
{
	public static void main (String[] args) throws IOException
	{
	// Scanner for keyb input
	Scanner keyb = new Scanner( System.in );

	// prepare the input file
	System.out.println("Input File Name: Infile.txt");
	Scanner input = new Scanner( new File("Infile.txt") );

	// prepare the output file
	System.out.println("Output File Name: Outfile.txt");
	PrintWriter output = new PrintWriter( new FileWriter("Outfile.txt") );

	// processing loop
	double sum = 0.00;
	// format
	String format1 = "###0.00" ;
    DecimalFormat fm1 = new DecimalFormat(format1);

	while ( input.hasNext() )
	{
    	// output
    	double num = input.nextDouble();
		output.println( fm1.format(num) );
		sum += num;
	}
	output.print("Sum : " + fm1.format(sum) );
	// close the files
	input.close();
	output.close();
	}
}