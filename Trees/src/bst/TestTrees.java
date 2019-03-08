package bst;

public class TestTrees
{
	public static void main(String[] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		
		int[] numbersToInsert = {22, -10, 55, 10, 0, 46, 33, 48, 40};
		for (int i = 0; i < numbersToInsert.length; i++)
		{
			bst.add(numbersToInsert[i]);
		}
		
		//test the values that should be in the tree
		for (int i = 0; i < numbersToInsert.length; i++)
		{
			System.out.println("found(" + numbersToInsert[i] + ")? " + 
		                        bst.contains(numbersToInsert[i]));
		}
		
		//test a value that is not in the tree
		System.out.println("found(20)? " + bst.contains(20));
	}
}
