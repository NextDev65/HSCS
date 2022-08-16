public class ReviewRunner
{
	public static void main(String[] args)
	{
		System.out.println( Review.sentimentVal("happily") );
		System.out.println( Review.sentimentVal("terrible") );
		System.out.println( Review.sentimentVal("cold") );
		System.out.println( Review.sentimentVal("gnarly") );
		System.out.println( Review.sentimentVal("funky") );
		System.out.println( Review.totalSentiment("uranium.txt") );
	}
}