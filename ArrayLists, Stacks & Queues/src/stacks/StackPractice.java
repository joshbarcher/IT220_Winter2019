package stacks;

import java.util.Stack;

public class StackPractice
{
	public static void main(String[] args)
	{
		Stack<Character> stack = new Stack<Character>();

		//make some changes
		stack.push('a');
		stack.push('b');
		stack.push('c');
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());

		stack.push('d');
		stack.push('e');
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	private static void introToStacks()
	{
		//create a FILO stack
		Stack<Character> stack = new Stack<Character>();
		
		//add a few elements to the stack
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		
		//remove all elements in reverse order and print them out!
		while (!stack.isEmpty())
		{
			char character = stack.pop();
			System.out.println(character);
		}
	}
}
