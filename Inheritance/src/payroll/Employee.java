package payroll;

import java.time.LocalDate;

public class Employee 
{
	//fields
	private String fullName;
	private LocalDate hireDate;
	private String positionTitle;
	
	//constructors
	public Employee(String fullName, LocalDate hireDate, 
			        String positionTitle)
	{
		this.fullName = fullName;
		this.hireDate = hireDate;
		this.positionTitle = positionTitle;
	}
	
	//methods
	public String getFullName()
	{
		return fullName;
	}
	
	public LocalDate getHireDate()
	{
		return hireDate;
	}
	
	public String getPositionTitle()
	{
		return positionTitle;
	}
	
	public String toString()
	{
		return "Employee: " + fullName;
	}
}











