import java.util.Scanner;

public class LessThan100 {
	public static void main(String[] args) {
		Scanner	keyb = new Scanner(System.in);
		int x;
		int y;

		System.out.print("Enter matrix size--> ");
		x =	keyb.nextInt();
		y =	keyb.nextInt();
		int[][]	matrix = new int[x][y];

		int	sum	= 0;

		for	(int r = 0;	r <	matrix.length; r++) {
			for	(int c = 0;	c <	matrix[r].length; c++) {
				matrix[r][c] = (int)(Math.random() * 200) + 1;
			}
		}

		for	(int r = 0;	r <	matrix.length; r++) {
			for	(int c = 0;	c <	matrix[r].length; c++) {
				System.out.print(matrix[r][c] +	" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Numbers	Less Than 100");
		System.out.println();
		System.out.println(" Row         Column");
		for	(int r = 0;	r <	matrix.length; r++) {
			for	(int c = 0;	c <	matrix[r].length; c++) {
				if (matrix[r][c] < 100)
				{
					System.out.print("  " +r+ "           " +c);
					System.out.println();
				}
			}
		}
	}
}