package bst;

import java.util.LinkedList;
import java.util.Queue;

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
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	private void inOrder(Node current)
	{
		//left, node, right
		if (current != null)
		{
			inOrder(current.left);
			System.out.println(current.data);
			inOrder(current.right);
		}
	}
	
	public void postOrder()
	{
		postOrder(root);
	}
	
	private void postOrder(Node current)
	{
		//left, right, node
		if (current != null)
		{
			postOrder(current.left);
			postOrder(current.right);
			System.out.println(current.data);
		}
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	private void preOrder(Node current)
	{
		//node, left, right
		if (current != null)
		{
			System.out.println(current.data);
			preOrder(current.left);
			preOrder(current.right);
		}
	}
	
	public void breadthFirstSearch()
	{
		Queue<Node> queue = new LinkedList<Node>();
		
		//add my root
		queue.offer(root);
		
		while (!queue.isEmpty())
		{
			//pull the node off the queue and report it
			Node next = queue.poll();
			System.out.println(next.data);
			
			//put the children back on the queue
			if (next.left != null)
			{
				queue.offer(next.left);
			}
			if (next.right != null)
			{
				queue.offer(next.right);
			}
		}
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
