//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		sort();
		String output = "";
		for (int i = 0; i < wordRay.length; i++)
		{
			output += "word " + i + " :: " + wordRay[i] + "\n";
		}
		return output;
	}
}