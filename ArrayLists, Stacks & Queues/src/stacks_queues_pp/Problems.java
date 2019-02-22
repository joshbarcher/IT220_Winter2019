package stacks_queues_pp;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Problems
{
	public static void main(String[] args)
	{
		//reverse()
		System.out.println("reverse(cow): " + reverse("cow"));
		System.out.println("reverse(anaconda): " + reverse("anaconda"));
		System.out.println("reverse(racecar): " + reverse("racecar"));
		
		//userNumbers()
		LinkedBlockingQueue<Integer> queue = userNumbers();
		while (!queue.isEmpty())
		{
			System.out.println("Number: " + queue.poll());
		}
		
		//balanced()
		System.out.println("balanced(\"({}[])[]\"): " + balanced("({}[])[]"));
		System.out.println("balanced(\"(({[](){}(())\"): " + balanced("(({[](){}(())"));
	}
	
	private static String reverse(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < input.length(); i++)
		{
			stack.push(input.charAt(i));
		}
		
		String result = "";
		while (!stack.isEmpty())
		{
			result += stack.pop();
		}
		
		return result;
	}
	
	private static LinkedBlockingQueue<Integer> userNumbers()
	{
		Scanner console = new Scanner(System.in);
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		
		boolean moreInput = true;
		do
		{
			System.out.println("Enter a number: ");
			int number = console.nextInt();
			queue.offer(number);
			
			System.out.println("Continue? (true/false)");
			moreInput = console.nextBoolean();
		} while (moreInput);
		
		return queue;
	}
	
	private static boolean balanced(String braces)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < braces.length(); i++)
		{
			char current = braces.charAt(i);
			
			if (current == '[' || current == '(' || current == '{') 
			{
				stack.push(current);
			}
			else
			{
				if (stack.isEmpty())
				{
					return false;
				}
				
				char matching = stack.pop();
				if (current == ']' && matching != '[')
				{
					return false;
				}
				else if (current == ')' && matching != '(')
				{
					return false;
				}
				else if (current == '}' && matching != '{')
				{
					return false;
				}
			}
		}
		
		if (!stack.isEmpty())
		{
			return false;
		}
		return true;
	}
}








