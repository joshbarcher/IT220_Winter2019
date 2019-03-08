package bst;

public class BinarySearchTree
{
	//fields
	private Node root;
	private int size;
	
	//constructors
	public BinarySearchTree()
	{
		//do nothing...
	}
	
	//methods
	public void add(int element)
	{
		//is our tree empty?
		if (root == null)
		{
			root = new Node(element);
			size++;
		}
		else
		{
			//search and place the element
			add(root, element);
		}
	}
	
	//this is a recursive method that will traverse the tree and insert the
	//number into the tree
	private void add(Node current, int element)
	{
		if (current.data == element)
		{
			return;
		}
		else if (current.data < element)
		{
			//is there a node to the right?
			if (current.right == null)
			{
				current.right = new Node(element);
				size++;
			}
			else
			{
				//recursively search to the right
				add(current.right, element);
			}
		}
		else //if (current.data > element)
		{
			//is there a node to the left?
			if (current.left == null)
			{
				current.left = new Node(element);
				size++;
			}
			else
			{
				//recursively search to the left
				add(current.left, element);
			}
		}
	}
	
	public boolean contains(int element)
	{
		return contains(root, element);
	}
	
	private boolean contains(Node current, int element)
	{
		if (current.data == element)
		{
			return true; //found it!
		}
		else if (current.data < element) //look to right
		{
			if (current.right == null)
			{
				return false; //element not found
			}
			else
			{
				return contains(current.right, element);
			}
		}
		else //if (current.data > element) //look to left
		{
			if (current.left == null)
			{
				return false; //element not found
			}
			else
			{
				return contains(current.left, element);
			}
		}
	}
	
	public int size()
	{
		return size;
	}
	
	private class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data)
		{
			this.data = data;
		}
		
		public String toString()
		{
			String leftOutput = left == null ? "null" : String.valueOf(left.data);
			String rightOutput = right == null ? "null" : String.valueOf(right.data);
			
			return leftOutput + " <-- " + data + " --> " + rightOutput;
		}
	}
}
