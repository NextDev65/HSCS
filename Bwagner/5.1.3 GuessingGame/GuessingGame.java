import java.util.*;

public class GuessingGame
{
    // instance variables
    private int number = 0;      // the random number
    private int myGuess = 0;     // current guess
    private int numGuesses = 0;  // number of guesses

    private Scanner keyboard = new Scanner(System.in);

    /** generates a random number in the range of
     *  1 to 100 inclusive.
     */
    public void generateNumber() {
    	number = (int)(Math.random()*100+1);
    }

    /** Displays a prompt asking player to make a guess. It
     *  reads the guess and stores it in the variable
     *  myGuess. It also increments the variable numGuesses.
     */
    public void makeGuess() {
    	System.out.println("");
    	System.out.println("");
    	System.out.print("Make Guess --> ");
    	myGuess = keyboard.nextInt();
    	System.out.println("");
    	numGuesses++;
    }

    /* Determines whether player's guess was correct. If
     * myGuess was a match it returns true. If myGuess was
     * less than number then it displays the message
     * "Too Low, Try Again!" and returns false. If myGuess
     *  was greater than number then it displays the
     *  message "Too High, Try Again!" and returns false.
     */
    public boolean winner() {
    	System.out.println("");
    	if(myGuess == number) {
    		return true;
    	}
    	if(myGuess > number) {
    		System.out.println("To high, Try again");
        	return false;
    	}
    	if(myGuess < number) {
    		System.out.println("To low, Try again");
        	return false;
    	}

    	return false;
    }

    /** Generates the random number then allows the player to
     *  continually guess the random number until it is found.
     *  Once the number is found it displays a message
     *  indicating how many guesses it took to find the
     *  number.
     */
    public void playGame() {
    	generateNumber();
    	do {
			makeGuess();
		} while (!winner());
    	System.out.println("");
    	System.out.println("");
    	System.out.println("===========================");
    	System.out.println("You found it in " + numGuesses + " tries.");

    	System.out.println("===========================");

    }

    public static void main (String[] args) {
        GuessingGame app = new GuessingGame();
        app.playGame();
    }
}