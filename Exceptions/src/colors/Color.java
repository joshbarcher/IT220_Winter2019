package colors;

public class Color
{
	private int red, green, blue;
	
	public Color(int red, int green, int blue)
	{
		checkComponents(red, green, blue);
		
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	private void checkComponents(int... components)
	{
		for (int i = 0; i < components.length; i++)
		{
			checkComponent(components[i]);
		}
	}
	
	//component is my red, green or blue value
	private void checkComponent(int component)
	{
		if (component < 0 || component > 255)
		{
			throw new IllegalArgumentException("Invalid component");
		}
	}

	public int getRed()
	{
		return red;
	}

	public int getGreen()
	{
		return green;
	}

	public int getBlue()
	{
		return blue;
	}
	
	public String toString()
	{
		return "(" + red + "," + green + "," + blue + ")";
	}
}
