import java.util.*;

public class SportsEvent
{
	// instance variables
	private double[] scores = new double[8];
	private Scanner keyboard = new Scanner(System.in);

	/* This method prompts the user to enter in 8 scores and stores
	* them in the array scores.
	*/
	public void readScores()
	{
		System.out.println("Enter Eight Contestant Scores:");
		for(int i = 0; i < 8; i++)
		{
			System.out.print("Judge " + (i + 1) + " --> ");
			scores[i] = keyboard.nextDouble();
		}
	}

	/* Determines which score in scores is the lowest
	* @return the lowest score in scores
	*/
	public double lowest()
	{
		double lowest = Double.MAX_VALUE;
		for(int i = 0; i < 8; i++)
		{
			if ( scores[i]<lowest )
				lowest = scores[i];
		}
		return lowest;
	}

	/* Determines which score in scores is the highest
	* @return the highest score in scores
	*/
	public double highest()
	{
		double highest = Double.MIN_VALUE;
		for(int i = 0; i < 8; i++)
		{
			if ( scores[i]>highest )
				highest = scores[i];
		}
		return highest;
	}

	/* Calculates the average of scores with the lowest and highest scores
	* thrown out.
	* @return the average
	*/
	public double average()
	{
		double sum = 0.0;
		for(double num : scores)
		{
			sum+=num;
		}
		return sum/8;
	}

	/* This method prints a summary report which includes the original list of
	* scores, the average of the scores, the lowest score, and the highest
	* score.
	*/
	public void printSummary()
	{
		System.out.println();
		System.out.println("                      Summary");
		System.out.println("-------------------------------------------------");
		System.out.println("Scores = " + scores[0] +" "+ scores[1] +" "+ scores[2] +" "+ scores[3] +" "+ scores[4] +" "+ scores[5] +" "+ scores[6] +" "+ scores[7]);
		System.out.println("Lowest Score  = " + lowest() );
		System.out.println("Highest Score = " + highest() );
		System.out.println("Average Score = " + average() );
	}

	public static void main(String[] args)
	{
		SportsEvent app = new SportsEvent();
		app.readScores();
		app.printSummary();
	}
}