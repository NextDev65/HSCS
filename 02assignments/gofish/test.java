import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class test {
	public static void main(String args[]) throws IOException {
		Scanner	file = new Scanner(new File("pr52.dat"));
		String p1 = file.nextLine();
		String p2 = file.nextLine();
		Boolean playerone = true;
		while (file.hasNextLine()) {
			String card = file.nextLine();
			if ((playerone && p2.contains(card)) || (!playerone && p1.contains(card)))
				System.out.println("HERE'S MY CARD");
			else if ((playerone && !p2.contains(card)) || (!playerone && !p1.contains(card)))
				System.out.println("GO FISH");
			playerone = !playerone;
		}
	}
}