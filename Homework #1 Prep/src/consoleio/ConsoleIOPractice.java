package consoleio;

import java.util.Scanner;

public class ConsoleIOPractice 
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int numerator = intChecker("Enter a numerator: ");
		int denominator = intChecker("Enter a denominator: ");
		
		
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
		System.out.println(value);
		
		return value;
	}
}

