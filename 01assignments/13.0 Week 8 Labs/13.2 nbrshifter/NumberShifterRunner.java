//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		Scanner keyb = new Scanner(System.in);
		System.out.print("array length :: ");
		int size = keyb.nextInt();
		NumberShifter words = new NumberShifter();
		int[] array = words.makeLucky7Array(size);
		System.out.println(Arrays.toString(array) );
		words.shiftEm(array);
		System.out.println(Arrays.toString(array) );


		System.out.print("array length :: ");
		size = keyb.nextInt();
		array = words.makeLucky7Array(size);
		System.out.println(Arrays.toString(array) );
		words.shiftEm(array);
		System.out.println(Arrays.toString(array) );

		System.out.print("array length :: ");
		size = keyb.nextInt();
		array = words.makeLucky7Array(size);
		System.out.println(Arrays.toString(array) );
		words.shiftEm(array);
		System.out.println(Arrays.toString(array) );
	}
}



