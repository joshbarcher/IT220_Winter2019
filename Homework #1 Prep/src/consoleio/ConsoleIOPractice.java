package consoleio;

import java.util.Scanner;

public class ConsoleIOPractice 
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//prompt and read
		int age = intChecker("Age? ");
		
		System.out.println("Name? ");
		String name = console.nextLine();
		
		System.out.println(name + " is " + age + " years old");
	}
	
	public static void divide()
	{
		int numerator = intChecker("Enter a numerator: ");
		int denominator = intChecker("Enter a denominator: ");
		
		//do some math, show some results
		int divide = numerator / denominator;
		int remainder = numerator % denominator;
		
		System.out.println("Results: " + divide + ", " + remainder);
	}
	
	public static int intChecker(String prompt)
	{
		//prompt and read
		System.out.print(prompt);
		
		//test whether we have an integer or not
		while (!console.hasNextInt())
		{
			System.out.println("Enter a valid integer: ");
			
			//clear out bad characters from the scanner
			console.nextLine();
		}
		
		int value = console.nextInt();
		console.nextLine(); //clear the buffer
		
		return value;
	}
}

