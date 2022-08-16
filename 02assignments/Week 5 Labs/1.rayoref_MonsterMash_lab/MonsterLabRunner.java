//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//ask for ht
		      out.print("Enter monster height :: ");
		      int height = keyboard.nextInt();
		
		      //ask for wt
		      out.print("Enter monster weight :: ");
		      int weight = keyboard.nextInt();
		
		      // ask for age
		      out.print("Enter monster age :: ");
		      int age = keyboard.nextInt();
		
		      //instantiate a new Monster() and add it to the herd
		      herd.add(i, new Monster(height, weight, age));
		
		      out.println();		
			
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
		System.out.println("LIGHEST :: " + herd.getSmallest() + "\n");
   		 System.out.println("HEAVIEST :: " + herd.getLargest() + "\n");

			
	}		
}