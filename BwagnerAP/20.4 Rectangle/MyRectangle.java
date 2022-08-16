public class MyRectangle
{
	// instance variables
	private int length;     // rectangle's length
	private int width;      // rectangle's width
	// constructor
	public MyRectangle(int len, int wid)
	{
		this.length = len;
		this.width = wid;
	}
	// accessor methods
	public int getlength()
	{
		return length;
	}
	public int getwidth()
	{
		return width;
	}
	// mutator methods
	public void setLength(int l)
	{
	   length = l;
	}
	public void setWidth(int w)
	{
	   width = w;
	}
	// other methods
	public int getPerimeter()
	{
		int perimeter = ((width * 2) + (length * 2));
		return perimeter;
	}
	public int getArea()
	{
		int area = (width * length);
		return area;
	}
	// toString
	public String toString()
	{
	   return "Length = " + length + "\n" +
	          "Width = " + width + "\n" +
	          "Perimeter = " + getPerimeter() + "\n" +
	          "Area = " + getArea();
	}
}