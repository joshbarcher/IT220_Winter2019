package interfaces;

public class Ladder implements Liftable
{
	private double heightInInches;
	private String material;
	
	public Ladder(double heightInInches, String material)
	{
		this.heightInInches = heightInInches;
		this.material = material;
	}

	public double getHeightInInches()
	{
		return heightInInches;
	}

	public String getMaterial()
	{
		return material;
	}
	
	public String toString()
	{
		return "Ladder made of " + material;
	}

	@Override
	public void pickUp()
	{
		System.out.println("You lift the ladder up high...");
	}
}







