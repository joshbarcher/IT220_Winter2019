package hw2hint;

import java.util.Arrays;
import java.util.Scanner;

import shapes.Rectangle;
import shapes.RightTriangle;
import shapes.Shape;

public class GroupShapes
{
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//create a data structure to hold our shapes
		Shape[] shapes = new Shape[1000];
		int nextIndex = 0;
		
		//add a few shapes based on user input
		for (int i = 1; i <= 5; i++)
		{
			//ask the user for a type of shape and add it to the shapes array
			System.out.println("Pick a shape:\n1.Rectangle\n2.Right Triangle");
			int userChoice = console.nextInt();
			
			if (userChoice == 1)
			{
				//create a rectangle
				Rectangle rect = getRectangle();
				shapes[nextIndex] = rect;
				nextIndex++;
			}
			else if (userChoice == 2)
			{
				//create a triangle
				RightTriangle triangle = new RightTriangle(4, 5);
				shapes[nextIndex] = triangle;
				nextIndex++;
			}
		}
		
		//print out our array
		System.out.println(Arrays.toString(shapes));
	}
	
	//prompts the user for values and returns a new Rectangle
	private static Rectangle getRectangle()
	{
		System.out.println("Enter a width: ");
		int width = console.nextInt();
		
		System.out.println("Enter a length: ");
		int length = console.nextInt();
		
		Rectangle rect = new Rectangle(width, length);
		return rect;
	}
}








