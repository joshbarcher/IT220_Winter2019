package enums;

import java.util.Scanner;

public class Arithmetic
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		//perform some arithmetic
		performArithmetic(Operator.SUB);
		performArithmetic(Operator.ADD);
		performArithmetic(Operator.MULT);
		
		//try letting the user enter a value and convert it to an enum
		System.out.println("Enter an operator (ADD, SUB, DIV, MULT): ");
		String userValue = console.nextLine();
		Operator operator = Operator.valueOf(userValue);
		performArithmetic(operator);
		
		//loop over enum values
		Operator[] values = Operator.values();
		for (int i = 0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}
	}

	private static void performArithmetic(Operator operator)
	{
		System.out.println(operator.getFullName());
		
		if (operator == Operator.ADD)
		{
			System.out.println("You added...");
		}
		else if (operator == Operator.SUB)
		{
			System.out.println("You subtracted...");
		}
		else if (operator == Operator.MULT)
		{
			System.out.println("You multiplied...");
		}
		else if (operator == Operator.DIV)
		{
			System.out.println("You divided...");
		}
		else
		{
			System.out.println("Enter a valid operator");
		}
	}
}
