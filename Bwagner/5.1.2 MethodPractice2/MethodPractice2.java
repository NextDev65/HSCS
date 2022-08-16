import java.util.*;

public class MethodPractice2 {

    private Scanner keyboard = new Scanner(System.in);


// Implement methods below this line

    private void greeting(String string, int i) {

    	for (int j = 0; j < i; j++) {
			System.out.println(string + ", Have a nice day.");
		}

    }

	private void range(int begin, int end) {
		for(int i = begin; i < end + 1; i++) {
			System.out.println(i);
		}
	}

	private boolean compare(String str) {

		String f;
		String l;

		f = str.substring(0, 1);

		l = str.substring(str.length() - 1, str.length());

		if(f.equalsIgnoreCase(l))
			return true;

		return false;
	}

	private String reverse(String string) {
		String r = "";
		String temp1;
		String temp2;

		for(int x = string.length(); x > 0; x--) {
			temp1 = r;
			temp2 = string.substring(x - 1, x);
			r = temp1 + temp2;
		}
		return r;
	}

	private int numOccurrences(String word, String let) {
		int r = 0;
		String temp1 = "";
		String temp2 = let;

		for(int x = word.length(); x > 0; x--) {
			temp1 = word.substring(x - 1, x);
			if(temp1.equalsIgnoreCase(temp2))
				r++;
		}
		return r;
	}


    public static void main(String[] args) {

        MethodPractice2 app = new MethodPractice2();

        System.out.println("******************");
        System.out.println("   Test greeting");
        System.out.println("******************");
        app.greeting("Kendall", 6);

        System.out.println("\n\n******************");
        System.out.println("   Test range");
        System.out.println("******************");
        app.range(10, 15);

        System.out.println("\n\n******************");
        System.out.println("   Test compare");
        System.out.println("******************");

        System.out.println(app.compare("demand"));
        System.out.println(app.compare("football"));
        System.out.println(app.compare("bulb"));




        System.out.println("\n\n******************");
        System.out.println("   Test reverse");
        System.out.println("******************");
        System.out.println(app.reverse("ball"));
        System.out.println(app.reverse("courage"));
        System.out.println(app.reverse("hamburger"));

        System.out.println("\n\n******************");
        System.out.println("   Test numOccurrences");
        System.out.println("******************");
        System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
        System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
        System.out.println(app.numOccurrences("TEXAS", "R"));
        System.out.println();

    }

}