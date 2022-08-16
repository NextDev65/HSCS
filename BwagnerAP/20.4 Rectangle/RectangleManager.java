import java.util.*;

public class RectangleManager
{
	// instance variables
	private MyRectangle rect;
	private Scanner keyboard;
	//
	public RectangleManager()
	{
		keyboard = new Scanner(System.in);
	}
	public void inputDimensions()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter length -->");
		int len = keyboard.nextInt();
		System.out.print("Enter width -->");
		int wid = keyboard.nextInt();
		rect = new MyRectangle(len, wid);
	}

	public void changeDimensions()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter length -->");
		int len = keyboard.nextInt();
		System.out.print("Enter width -->");
		int wid = keyboard.nextInt();
		rect = new MyRectangle(len, wid);
	}
	public void print()
	{
		System.out.println(rect);
	}
	public static void main(String[] args)
	{
		RectangleManager app = new RectangleManager();

		System.out.println("*************************************");
		System.out.println("  Test Constructor and Input Method");
		System.out.println("*************************************");
		app.inputDimensions();
		app.print();

		System.out.println("************************");
		System.out.println("  Test Mutator Method");
		System.out.println("************************");
		app.changeDimensions();
		app.print();
	}
}