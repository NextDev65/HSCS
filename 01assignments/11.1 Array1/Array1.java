import java.io.* ;
import java.util.*;

public class Array1
{
	public int[] data = {3, 1, 5, 7, 4, 12, 3, 8, 2, 6};

	public void dispArray()
	{
		// System.out.println( Arrays.toString(data) );
		System.out.println("ArrayPosition: " + 0 + " " + 1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " " + 9 + "\n" + "Display Array: " + data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5] + " " + data[6] + " " + data[7] + " " + data[8] + " " + data[9] );
	}
	public void resArray()
	{
		for (int i = 0; i < data.length; i++)
		{
			data[i] = -1;
		}
	}
	public void setArray(int set)
	{
		for (int i = 0; i < data.length; i++)
		{
			data[i] = set;
		}
	}

	public static void main(String[] args)
	{
		Array1 arr = new Array1();
		Scanner keyb = new Scanner(System.in);
		int choice = 1;
		while (choice>0 && choice<4)
		{
			System.out.println("Display : 1");
			System.out.println("Reset : 2");
			System.out.println("Set : 3");
			System.out.println("-----------------------");
			choice = keyb.nextInt();
			switch (choice)
			{
				case 1:
					arr.dispArray();
					break;
				case 2:
					arr.resArray();
					break;
				case 3:
					System.out.println("SetValue : ");
					int set = keyb.nextInt();
					arr.setArray(set);
					break;
			}
			System.out.println("-----------------------");
		}
	}
}