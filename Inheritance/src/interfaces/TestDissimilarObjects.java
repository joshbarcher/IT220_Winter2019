package interfaces;

public class TestDissimilarObjects
{
	public static void main(String[] args)
	{
		Ladder ladder = new Ladder(60, "metal");
		Shark shark = new Shark("great white", 15);
		
		//group together our dissimilar objects
		Object[] objects = {ladder, shark};
		
		for (int i = 0; i < objects.length; i++)
		{
			System.out.println(objects[i].toString());
		}
		
		Liftable[] liftables = {ladder, shark};
		
		for (int i = 0; i < liftables.length; i++)
		{
			liftables[i].pickUp();
		}
	}
}
