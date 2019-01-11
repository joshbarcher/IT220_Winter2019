package randomization;

import java.util.Random;

public class RandomPractice 
{
	private static Random random = new Random();
	
	public static void main(String[] args) 
	{
		Random myRandom = new Random(100);
		
		for (int i = 1; i <= 100; i++)
		{
			int number = myRandom.nextInt(10);
			System.out.println(number);
		}
	}
	
	public static int randomBetween(int low, int high)
	{
		return random.nextInt(high - low + 1) + low;
	}
}
