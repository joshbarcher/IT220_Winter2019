package randomization;

import java.util.Random;

public class RandomPractice 
{
	public static void main(String[] args) 
	{
		Random myRandom = new Random(100);
		
		for (int i = 1; i <= 100; i++)
		{
			int number = myRandom.nextInt(10);
			System.out.println(number);
		}
	}
}
