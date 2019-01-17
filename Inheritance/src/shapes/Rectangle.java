package shapes;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		super("Rectangle");
		
		this.length = length;
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}
	
	public String toString()
	{
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}
