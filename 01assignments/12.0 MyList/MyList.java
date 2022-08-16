import java.util.Scanner;
class MyList {
	// runr
	public static void main( String args[] )
	{
		Scanner keyb = new Scanner(System.in);
		System.out.print("array length :: ");
		int len = keyb.nextInt();
		MyList myli = new MyList (len);
		int choice = 1;
		int pos;
		int sn;
		while (choice>0 && choice<9)
		{
			System.out.println("1 : init           : Initializes the list to random numbers");
			System.out.println("2 : displayList    : Displays the entire list");
			System.out.println("3 : displayElement : Displays a single element in the list");
			System.out.println("4 : bubbleSort     : Implements bubble sort algorithm");
			System.out.println("5 : selectionSort  : Implements selection sort algorithm");
			System.out.println("6 : insertionSort  : Implements insertion sort algorithm");
			System.out.println("7 : binarySearch   : Implements binary search algorithm");
			System.out.println("8 : linearSearch   : Implements linear search algorithm");
			System.out.println("-----------------------");
			choice = keyb.nextInt();
			switch (choice)
			{
				case 1:
					myli.init();
					break;
				case 2:
					myli.displayList();
					break;
				case 3:
					System.out.print("position : ");
					pos = keyb.nextInt();
					myli.displayElement(pos);
					break;
				case 4:
					myli.bubbleSort();
					break;
				case 5:
					myli.selectionSort();
					break;
				case 6:
					myli.insertionSort();
					break;
				case 7:
					System.out.print("search number : ");
					sn = keyb.nextInt();
					System.out.println( myli.binarySearch(sn) );
					break;
				case 8:
					System.out.print("search number : ");
					sn = keyb.nextInt();
					System.out.println( myli.linearSearch(sn) );
					break;
			}
			System.out.println("-----------------------");
		}
	}
	// Instance variables
	private int a[];
	private int listLen;

	// Constructor
	MyList(int len) {
		a = new int[len];
		listLen = len;
	}

	//swap
	//	You may use this method as needed
	private void swap(int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	//init
	//	Initializes the list to random numbers
	public void init()
	{
		for (int i = 0; i < listLen; i++)
			a[i] = (int)(Math.random() * listLen * 10) + 1;
	}
	//displayList
	//	Displays the entire list
	public void displayList()
	{
		System.out.println();
		for (int i = 0; i < listLen; i++)
			System.out.println( a[i] );
	}
	//displayElement
	//	Displays a single element in the list
	public void displayElement(int pos)
	{
		System.out.println();
		System.out.println( a[pos] );
	}
	//linearSearch
	//	Implements linear search algorithm
	public boolean linearSearch(int sn)
	{
		boolean found = false;
		int k = 0;
		while (k < listLen && !found)
		{
			if (a[k] == sn)
				found = true;
			else
				k++;
		}
		return found;
	}
	//bubbleSort
	//	Implements bubble sort algorithm
	public void bubbleSort()
	{
		for (int p = 1; p < listLen; p++)
			for (int q = 0; q < listLen-p; q++)
				if (a[q] > a[q+1])
				{
					swap(q,q+1);
					displayList();
					pause();
				}
	}
	//binarySearch
	//	Implements binary search algorithm
	public boolean binarySearch(int sn)
	{
		boolean found = false;
		int lo = 0;
		int hi = listLen-1;
		while (lo <= hi && !found)
		{
			int mid = (lo + hi) / 2;
			if (a[mid] == sn)
				found = true;
			else
			{
				if (sn > a[mid])
					lo = mid + 1;
				else
					hi = mid - 1;
			}
		}
		return found;
	}
	//selectionSort
	//	Implements selection sort algorithm
	public void selectionSort()
	{
		for (int p = 0; p < listLen-1; p++)
		{
			int smallest = p;
			for (int q = p+1; q < listLen; q++)
				if (a[q] < a[smallest])
					smallest = q;
			if (a[p] != a[smallest])
				swap(p,smallest);
			displayList();
			pause();
		}
	}
	//insertionSort
	//	Implements insertion sort algorithm
	public void insertionSort()
	{
		int i, j, newValue;
		for (i = 1; i < a.length; i++)
		{
			newValue = a[i];
			j = i;
			while (j > 0 && a[j - 1] > newValue)
			{
				a[j] = a[j - 1];
				j--;
			}
			a[j] = newValue;
			displayList();
			pause();
		}
	}
	// pause
	public static void pause()
	{
		Scanner input = new Scanner(System.in);
		String dummy;
		System.out.print("\nPress <Enter> to continue ");
		dummy = input.nextLine();
	}
} // end MyList