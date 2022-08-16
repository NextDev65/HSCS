import java.io.* ;
import java.util.*;

public class Array3
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		System.out.print("length : ");
		int maxSize = keyb.nextInt();
		System.out.println("-----------------------");
		MyArray arr = new MyArray(maxSize);
		int choice = 1;
		int i;
		int v;
		int ind;
		while (choice>0 && choice<8)
		{
			System.out.println("returns changing length of array                                                : 1");
			System.out.println("adds the integer to the end of the array and returns false if array is full     : 2");
			System.out.println("inserts the value at the index and returns false if index invalid or array full : 3");
			System.out.println("returns value at index                                                          : 4");
			System.out.println("prints the entire array                                                         : 5");
			System.out.println("replaces value and returns old value and returns -1 if invalid index            : 6");
			System.out.println("deletes element at index, compresses list and returns -1 if invalid index       : 7");
			System.out.println("-----------------------");
			choice = keyb.nextInt();

			switch (choice)
			{
				case 1:
					System.out.println( arr.len() );
					break;
				case 2:
					System.out.print("value : ");
					int val = keyb.nextInt();
					System.out.println( arr.add(val) );
					break;
				case 3:
					System.out.print("index : ");
					i = keyb.nextInt();
					System.out.print("value : ");
					v = keyb.nextInt();
					System.out.println( arr.add(i, v) );
					break;
				case 4:
					System.out.print("index : ");
					ind = keyb.nextInt();
					System.out.println( arr.get(ind) );
					break;
				case 5:
					arr.dispArray();
					break;
				case 6:
					System.out.print("index : ");
					i = keyb.nextInt();
					System.out.print("value : ");
					v = keyb.nextInt();
					System.out.println( arr.set(i, v) );
					break;
				case 7:
					System.out.print("index : ");
					ind = keyb.nextInt();
					System.out.println( arr.remove(ind) );
					break;
			}
			System.out.println("-----------------------");
		}
	}
}

class MyArray
{
	private int len = 0;
	private int[] data;
	private int index = 0;
	public MyArray(int maxSize)
	{
		data = new int[maxSize];
	}
	public int len()
	{
		return len;
	}
	public boolean add(int i)
	{
		if (len<data.length)
		{
			data[len] = i;
			len++;
			index++;
			return true;
		}
		else
			return false;
	}
	public boolean add(int index, int value)
	{
		boolean add;
		if (len<data.length)
		{
			if (index<=data.length || index>=0)
			{
				len++;
				data[index]=value;
				add = true;
				if (index>=len)
				{
					len = index+1;
				}
			}
			else
			{
				add = false;
			}
		}
		else
		{
			add = false;
		}
		return add;
	}

	public int get(int index)
	{
		return data[index];
	}

	public void dispArray()
	{
		System.out.println("Display Array: ");
		for (int i = 0; i<len; i++)
		{
			System.out.print(data[i] +" ");
		}
		System.out.println();
	}
	public int set(int index, int value)
	{

		if (index>=0 && index<=len)
		{
			int temp = data[index];
			data[index] = value;
			return temp;
		}
		else
		{
			return -1;
		}
	}
	public int remove(int index)
	{
		int temp = 0;
		int x = 0;
		if (index>-1 && index <= len)
		{
			x = data[index];
			for (int i = index; i < data.length-1; i++)
			{
				temp = data[i];
				data[i]=data[i+1];
				data[i+1]=temp;
			}
		}
		else
		{
			return -1;
		}
		len--;
		return x;
	}
}