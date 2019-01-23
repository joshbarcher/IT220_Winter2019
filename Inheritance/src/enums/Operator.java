package enums;

public enum Operator
{
	ADD("addition"),
	SUB("subtraction"),
	MULT("multiplication"),
	DIV("division");
	
	private String fullName;
	
	private Operator(String fullName)
	{
		this.fullName = fullName;
	}
	
	public String getFullName()
	{
		return fullName;
	}
}
