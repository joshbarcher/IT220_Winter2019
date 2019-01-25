package colors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestColors
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Color userColor = getColor();
		System.out.println(userColor.toString());
	}
	
	public static Color getColor()
	{
		while (true)
		{
			try
			{
				System.out.println("Red?");
				int red = console.nextInt();
				System.out.println("Green?");
				int green = console.nextInt();
				System.out.println("Blue?");
				int blue = console.nextInt();
				
				Color color = new Color(red, green, blue);
				return color;
			}
			catch (InputMismatchException ex)
			{
				System.out.println("Please enter a valid integer");
				
				//clear the buffer of bad characters in the Scanner
				console.nextLine();
			}
			catch (IllegalArgumentException ex)
			{
				//print out an error message for the user
				System.out.println("Please enter a color component within the range [0,255]");
			}
		}
	}
}
