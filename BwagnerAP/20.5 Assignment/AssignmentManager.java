import java.util.*;

public class AssignmentManager
{
//	public static void main(String[] args)
//	{
		// instance variables
		private Assignment grade;
		private Scanner keyboard;
		//
		public AssignmentManager()
		{
			keyboard = new Scanner(System.in);
		}
		// default
		public void defaultTNS()
		{
			System.out.println("Type         : ");
			System.out.println("Name         : ");
			System.out.println("Score        : ");
			grade = new Assignment();
		}
		// accessor
		public void inputTNS()
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Type         : ");
			String typ = keyboard.nextLine();
			System.out.print("Name         : ");
			String nam = keyboard.nextLine();
			System.out.print("Score        : ");
			int scor = keyboard.nextInt();
			grade = new Assignment(nam, typ, scor);
		}
		// mutator
		public void changeTNS()
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Type         : ");
			String typ = keyboard.nextLine();
			System.out.print("Name         : ");
			String nam = keyboard.nextLine();
			System.out.print("Score        : ");
			int scor = keyboard.nextInt();
			grade = new Assignment(nam, typ, scor);
		}
		public void print()
		{
			System.out.println(grade);
		}
		public static void main(String[] args)
		{
			AssignmentManager app = new AssignmentManager();

			System.out.println("/**************************************/");
			System.out.println("/*     Test Default Constructor       */");
			System.out.println("/*     and Accessor methods           */");
			System.out.println("/**************************************/");
			app.defaultTNS();
			app.print();

			System.out.println("/**************************************/");
			System.out.println("/*     Test 2nd Constructor           */");
			System.out.println("/*     and Accessor methods           */");
			System.out.println("/**************************************/");
			app.inputTNS();
			app.print();
			app.inputTNS();
			app.print();

			System.out.println("/**************************************/");
			System.out.println("/*     Test Mutator methods           */");
			System.out.println("/*     and Accessor methods           */");
			System.out.println("/**************************************/");
			app.changeTNS();
			app.print();
			app.changeTNS();
			app.print();
		}
//	}
}