package examples;

import java.util.ArrayList;

public class ArrayListPractice
{
	public static void main(String[] args)
	{
		//create a resizable list that keeps growing with new elements
		ArrayList<String> list = new ArrayList<String>();
		
		//add a few elements to the list
		list.add("Welcome"); //assign index 0
		list.add("Back"); //assign index 1
		list.add("Snow"); //assign index 2
		
		//add an element at a specific index
		list.add(1, "oh no");
		
		//what does the list look like now? [Welcome, oh no, Back, Snow]
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(i + ": " + list.get(i));
		}
		
		//contains() - return true if an element is in the list
		boolean present = list.contains("Snow");
		System.out.println(present);
		
		//clear() - removes all elements from the list
		list.clear();
		
		//print the list afterwards
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(i + ": " + list.get(i));
		}
		
		list.add("the");
		list.add("story");
		list.add("is");
		list.add("at");
		list.add("the end");
		list.add("is");
		list.add("at");
		
		//search for partial matches - "do any of the strings in the list
		//contain the letters 'th'"
		for (int i = 0; i < list.size(); i++)
		{
			String element = list.get(i);
			if (element.contains("t"))
			{
				System.out.println("Found 't' in - " + element);
			}
		}
		
		//remove(element) and remove(index)
		list.remove(1); //will remove "story"
		list.remove("is"); //will remove the first occurrence of "is"
		
		//print the list
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(i + ": " + list.get(i));
		}
	}
	
	private static void foo()
	{
		String[] array = new String[10]; //fixed size!!!
		
		array[0] = "Hello";
		array[6] = "world";
	}
}
