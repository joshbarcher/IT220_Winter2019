package interfaces;

public class Shark implements Liftable
{
	private String type;
	private double lengthInFeet;
	
	public Shark(String type, double lengthInFeet)
	{
		this.type = type;
		this.lengthInFeet = lengthInFeet;
	}

	public String getType()
	{
		return type;
	}

	public double getLengthInFeet()
	{
		return lengthInFeet;
	}
	
	public String toString()
	{
		return "A " + type + " shark";
	}

	@Override
	public void pickUp()
	{
		System.out.println("The shark bites you...");
	}
}






