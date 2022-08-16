import java.util.Scanner;
import java.io.*;

public class InputFile
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
	System.out.print("Output File Name: OutputFile.txt");
	PrintWriter output = new PrintWriter( new FileWriter("OutputFile.txt") );

	// processing loop
	while( input.hasNext() )
	{
		String line = input.nextLine();
		output.println(line);
	}

	// close the files
	input.close();
	output.close();
	}
}