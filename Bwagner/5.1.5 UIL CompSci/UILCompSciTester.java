import java.util.*;

public class UILCompSciTester
{
    public static void main(String[] args)
    {
        String name = UILCompSci.readString("Enter contestant's name --> ");
        int c = UILCompSci.readInt("Number correct --> ");
        int i = UILCompSci.readInt("Number incorrect --> ");
        
        int skips = UILCompSci.skips(c, i);
        int score = UILCompSci.score(c, i);
        
        System.out.println("Contestant's Name : " +name);
		System.out.println("Correct           : " +c);
		System.out.println("Incorrect         : " +i);
		System.out.println("Skips             : " +skips);
		System.out.println("------------------------------");
		System.out.println("Score             : " +score);
    }
}