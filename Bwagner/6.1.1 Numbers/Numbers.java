import java.util.*;

public class Numbers {
	private	int[] nums = new int[20];
	private	int[] positives	= new int[20];
	private	int[] negatives	= new int[20];
	private	int	p =	0; // logical size of positives	array
	private	int	n =	0; // logical size of negatives	array
	public String s	= "";
	/**	precondition: none
	 *	postcondition: nums	has	been populated with	random numbers
	 *	   in the range	of -100	to 100.
	 */

	public void	selectionSort() {
		for	(int i = 0;	i <	nums.length; i++) {
			int	minVal = i;
			for	(int j = i + 1;	j <	nums.length; j++) {
				if (nums[j]	< nums[i]) {
					minVal = j;
				}
			}
			if (minVal != i) {
				int	temp = nums[i];
				nums[i]	= nums[minVal];
				nums[minVal] = temp;
			}
		}
	}

	public void	insertionSort() {
		for	(int i = 1;	i <	nums.length; i++) {
			int	temp = nums[i];
			int	j = i;
			while ((j >	0) && (nums[j -	1] > temp)) {
				nums[j]	= nums[j - 1];
				j--;
			}
			nums[j]	= temp;
		}
	}


	public void	populateNums() {
		for	(int i = 0;	i <	nums.length; i++) {
			nums[i]	= (int)(Math.random() *	201) - 100;
		}
		p = 0;
		n = 0;
	}
	/**	precondition: none
	 *	postcondition: positives has been populated	with all the
	 *	   numbers in nums that	were positive. The variable	p has
	 *	   has been	updated	to reflect the logical size of
	 *	   positives array.
	 */
	public void	populatePositives() {
		for	(int i = 0;	i <	nums.length; i++) {
			if (nums[i]	> -1) {
				positives[p] = nums[i];
				p++;
			}
		}

	}

	/**	precondition: none
	 *	postcondition: negatives has been populated	with all the
	 *	   numbers in nums that	were negative. The variable	n has
	 *	   has been	updated	to reflect the logical size of
	 *	   negatives array.
	 */
	public void	populateNegatives() {
		for	(int i = 0;	i <	nums.length; i++) {
			if (nums[i]	< 0) {
				negatives[n] = nums[i];
				n++;
			}
		}
	}

	/**	precondition: size >=0
	 *	postcondition: all the values of array have	been printed
	 *	   from	index 0	to the logical size	of the array.
	 *	@param array the array to be printed.
	 *	@param size	the	logical	size of	array
	 */
	public void	print(int[]	array, int size) {
		for	(int i = 0;	i <	size; i++) {
			s =	s +	array[i] + " ";
		}
		System.out.println(s);
		s =	"";
	}

	/**	precondition: none
	 *	postcondition: all three arrays	have been printed with
	 *	   appropriate labelling.
	 */
	public void	printArrays() {
		System.out.println("\n\nRandom Numbers = " + nums.length);
		System.out.println("======================");
		print(nums,	nums.length);
		System.out.println("\n\nPositive Numbers = " + p);
		System.out.println("======================");
		print(positives, p);
		System.out.println("\n\nNegative Numbers = " + n);
		System.out.println("======================");
		print(negatives, n);
	}

	public static void main(String[] args) {
		Numbers	app	= new Numbers();
		app.populateNums();
		app.populatePositives();
		app.populateNegatives();
		app.selectionSort();
		app.printArrays();

		app.populateNums();

		app.insertionSort();
		app.populatePositives();
		app.populateNegatives();
		app.printArrays();
	}
}