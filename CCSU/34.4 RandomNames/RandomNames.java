class RandomNames
{
	public static void main(String[] args)
	{
		int rand = (int)(Math.random()*11)+1;
		String first = new String("");
		String last = new String("");
		// String first
		switch (rand)
		{
			case 1:
				first += "Qwerty";
				break;
			case 2:
				first += "Quark";
				break;
			case 3:
				first += "Yertle";
				break;
			case 4:
				first += "John";
				break;
			case 5:
				first += "Tony";
				break;
			case 6:
				first += "Thomas";
				break;
			case 7:
				first += "Michael";
				break;
			case 8:
				first += "Ron";
				break;
			case 9:
				first += "Harry";
				break;
			case 10:
				first += "Zach";
				break;
			case 11:
				first += "Jay";
				break;
			case 12:
				first += "Edward";
				break;
		}
		// last
		switch (rand)
		{
			case 1:
				first += "Quirm";
				break;
			case 2:
				first += "Cam";
				break;
			case 3:
				first += "Yam";
				break;
			case 4:
				first += "Jam";
				break;
			case 5:
				first += "Shin	";
				break;
			case 6:
				first += "Lisenby";
				break;
			case 7:
				first += "Penner";
				break;
			case 8:
				first += "Ram";
				break;
			case 9:
				first += "Ham";
				break;
			case 10:
				first += "Zoom";
				break;
			case 11:
				first += "Choi";
				break;
			case 12:
				first += "Ethan";
				break;
		}
    System.out.println ("Hello, " +first+ " " +last);
	}
}