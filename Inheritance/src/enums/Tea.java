/*
 * Josh Archer
 * This is a class the represents a container of tea.
 * Tea.java
 * 1/10/2019
 */

package enums;

/**
 * This is a class the represents a container of tea.
 * 
 * @author Josh Archer
 * @version 1.0
 */
public class Tea 
{
	//fields
	private boolean caffeinated;
	private String container;
	private TeaType type;
	
	/**
	 * This creates a new cup of caffeinated earl gray tea!
	 */
	public Tea()
	{
		caffeinated = true;
		container = "cup";
		type = TeaType.OOLONG;
	}
	
	/**
	 * Creates a new container of tea.
	 * 
	 * @param caffeinated is the tea caffeinated or not?
	 * @param container is this a cup of tea or a bottle?
	 * @param type the type of tea
	 */
	public Tea(boolean caffeinated, String container, TeaType type)
	{
		this.caffeinated = caffeinated;
		this.container = container;
		this.type = type;
	}
	
	/**
	 * This returns whether the tea is caffeinated or not.
	 * @return true if caffeinated, otherwise false
	 */
	public boolean getCaffeinated()
	{
		return caffeinated;
	}
	
	/**
	 * This returns the container that holds the tea.
	 * @return a string, for example: "bottle" or "cup"
	 */
	public String getContainer()
	{
		//we maintain control when accessing the field
		return container.toUpperCase();
	}
	
	/**
	 * This returns the type of tea.
	 * @return a string, for example: "green" or "earl gray"
	 */
	public TeaType getType()
	{
		return type;
	}
	
	/**
	 * Changes the caffeinated status of the tea.
	 * @param caffeinated true if caffeinate or false otherwise
	 */
	public void setCaffeinated(boolean caffeinated)
	{
		this.caffeinated = caffeinated;
	}
	
	/**
	 * Changes the container that holds the tea.
	 * @param container a container for the tea
	 */
	public void setContainer(String container)
	{
		this.container = container;
	}
	
	/**
	 * Changes the type of tea.
	 * @param type the new type of tea
	 */
	public void setType(TeaType type)
	{
		this.type = type;
	}
	
	/**
	 * Returns a string representation of a tea drink.
	 * 
	 * @return a string representation of the tea
	 */
	public String toString()
	{
		return "This is a " + container + " of " + type + " tea!";
	}
}









