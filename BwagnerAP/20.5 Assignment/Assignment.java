public class Assignment
{
	// instance variables
	private String name;
	private String type;
	private int score;
	// constructors
	public Assignment()
	{
		name = ""; type = ""; score = 0;
	}
	public Assignment(String nam, String typ, int scor)
	{
		this.name = nam;
		this.type = typ;
		this.score = scor;
	}
	// accessor methods
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public int getScore()
	{
		return score;
	}
	// mutator methods
	public void setName(String n)
	{
	   name = n;
	}
	public void setType(String t)
	{
	   type = t;
	}
	public void setScore(int s)
	{
	   score = s;
	}
	// other methods
	public String getLetterGrade()
	{
		if(score >= 90 && score <= 100)
			return "A";
		if(score >= 80 && score <= 89)
			return "B";
		if(score >= 70 && score <= 79)
			return "C";
		if(score >= 60 && score <= 69)
			return "D";
		if(score < 60)
			return "F";
		else
			return "A+ ?";
	}
	// toString
	public String toString()
	{
	   return "Letter Grade : " + getLetterGrade() + "\n";
	}
}