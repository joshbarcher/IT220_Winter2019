package shapes;

public class TestShapes
{
	public static void main(String[] args)
	{
		//create a few shapes
		Rectangle rect = new Rectangle(10, 20);
		Square square = new Square(30);
		RightTriangle triangle = new RightTriangle(1, 4);
		
		Shape[] shapes = {rect, square, triangle};
		
		for (int i = 0; i < shapes.length; i++)
		{
			System.out.println(shapes[i].toString());
		}
	}
}
