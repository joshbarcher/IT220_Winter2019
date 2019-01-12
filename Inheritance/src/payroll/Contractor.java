package payroll;

import java.time.LocalDate;

//Contractor is a child class of Employee
public class Contractor extends Employee
{
	//fields specific to contractors
	private double contractPay;
	private LocalDate hiredUntil;
	
	//constructor
	public Contractor(String fullName, LocalDate hireDate,
			String position, double contractPay, LocalDate hiredUntil)
	{
		//our child class (Contractor) will call the parent class (Employee)
		//constructor
		super(fullName, hireDate, position);
		
		this.contractPay = contractPay;
		this.hiredUntil = hiredUntil;
	}
	
	public double getContractPay()
	{
		return contractPay;
	}
}
