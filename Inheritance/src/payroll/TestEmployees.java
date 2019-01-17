package payroll;

import java.time.LocalDate;

public class TestEmployees 
{
	public static void main(String[] args) 
	{
		//try to create an employee
		Employee employee = new Employee("Sarah Smithers",
				LocalDate.now(), "CFO");
		
		//try to create a contractor
		Contractor contractor = new Contractor("Jose Smith",
				LocalDate.now(), "SDT", 50000, LocalDate.now());
	}
}
