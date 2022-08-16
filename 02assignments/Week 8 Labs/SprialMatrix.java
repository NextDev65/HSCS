//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix

	public SpiralMatrix()
	{
		private int[][] matrix;
    	private int size;
	}

	public SpiralMatrix(int size)
	{
		matrix = new int[size][size]
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}

	public void createSpiral()
	{
		int x = 0; int y = 0;
		for (int a = 0; a < size; a++)
		{
			matrix[a][y] = a + 1
		}
	}

	public String toString( )
	{
		String output="";
		return output;
	}
}