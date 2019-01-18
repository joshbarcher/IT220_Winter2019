package shapes;

public class RightTriangle extends Shape
{
	private double base;
	private double height;
	
	public RightTriangle(double base, double height)
	{
		super("Right Triangle");
		
		this.base = base;
		this.height = height;
	}

	public double getBase()
	{
		return base;
	}

	public double getHeight()
	{
		return height;
	}
	
	public double area()
	{
		return 0.5 * base * height;
	}
	
	public String toString()
	{
		return "RightTriangle [base=" + base + ", height=" + height + "]";
	}
}
