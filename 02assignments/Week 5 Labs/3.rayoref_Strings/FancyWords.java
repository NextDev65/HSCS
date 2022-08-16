//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
		for(int i = 0; i < wordRay.length/2; i++) {
			String temp = wordRay[i];
			wordRay[i] = wordRay[wordRay.length-i-1];
			wordRay[wordRay.length-i-1]=temp;
		}
	}
	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < wordRay.length; i++){
			if(wordRay[i].length()>max){
				max = wordRay[i].length();
			}	
		}
		for(int i = 0; i < wordRay.length; i++) {
			while(wordRay[i].length()!=max) {
				wordRay[i] = " " + wordRay[i];
			}
		}
		for(int j = 1; j<=max; j++) {
			for(int i = 0; i < wordRay.length; i++) {
				output+=(wordRay[i].charAt(wordRay[i].length()-j));
			}
			output+="\n";
		}		
		return output+"\n";
	}
}