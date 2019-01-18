package shapes;

public class Square extends Rectangle
{
	//attributes?
	
	public Square(double side)
	{
		super(side, side);
	}

	//I inherit area() from Rectangle...
	
	public double area()
	{
		return -1;
	}
	
	public String toString()
	{
		return super.toString() + " Square[]";
	}
}
