package basicclasses;

public class Tea 
{
	//fields
	private boolean caffeinated;
	private String container;
	private String type;
	
	//default constructor
	public Tea()
	{
		caffeinated = true;
		container = "cup";
		type = "earl gray";
	}
	
	//parameterized constructor
	public Tea(boolean caffeinated, String container, String type)
	{
		this.caffeinated = caffeinated;
		this.container = container;
		this.type = type;
	}
	
	//methods
	public boolean getCaffeinated()
	{
		return caffeinated;
	}
	
	public String getContainer()
	{
		//we maintain control when accessing the field
		return container.toUpperCase();
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setCaffeinated(boolean caffeinated)
	{
		this.caffeinated = caffeinated;
	}
	
	public void setContainer(String container)
	{
		this.container = container;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String toString()
	{
		return "This is a " + container + " of " + type + " tea!";
	}
}









