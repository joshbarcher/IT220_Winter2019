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
	
	public double area()
	{
		return length * width;
	}
	
	public void printArea()
	{
		System.out.println(area());
	}
	
	public String toString()
	{
		return super.toString() + " Rectangle [length=" + length + ", width=" + width + "]";
	}
}





