package shapes;

public class TestShapes
{
	public static void main(String[] args)
	{
		//create a few shapes
		Rectangle rect = new Rectangle(10, 20);
		Square square = new Square(30);
		RightTriangle triangle = new RightTriangle(1, 4);
		//Shape rhombus = new Shape("rhombus");
		
		//this is called up-casting
		Shape[] shapes = {rect, square, triangle};
		
		for (int i = 0; i < shapes.length; i++)
		{
			//detect the type of a variable using instanceof
			if (shapes[i] instanceof RightTriangle)
			{
				RightTriangle anotherTriangle = (RightTriangle)shapes[i];
				System.out.println("Found you triangle!");
				System.out.println("Base of triangle: " + 
				                   anotherTriangle.getBase());
			}
			else if (shapes[i] instanceof Square)
			{
				System.out.println("Found a square");
			}
			else if (shapes[i] instanceof Rectangle)
			{
				System.out.println("Found a rectangle");
			}
			
			System.out.println(shapes[i].toString());
			System.out.println(shapes[i].area());
		}
		
		square.printArea();
	}
}



