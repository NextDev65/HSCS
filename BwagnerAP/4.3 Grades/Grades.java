class Grades
{
  public static void main ( String[] args )
  {
  	// int Avg
  	double dailyAvg = 88.0;
  	double quizAvg = 74.0;
  	double testAvg = 95.0;
  	double sixWeeksAvg = 0.0;
  	int roundedAvg = 0;
  	// calc
  	sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5;
  	// round
  	roundedAvg = (int)(sixWeeksAvg + 0.5);
  	// output
  	System.out.println("Daily Average = " +dailyAvg);
  	System.out.println("Quiz Average = " +quizAvg);
  	System.out.println("Test Average = " +testAvg);
  	System.out.println("--------------------------");
  	System.out.println("Six Weeks Average = " +sixWeeksAvg);
  	System.out.println("Six Weeks Average(Rounded) = " +roundedAvg);
  }
}