package basicclasses;

public class TestingOurTeaObjects 
{
	public static void main(String[] args) 
	{
		//create a few objects
		Tea cupOfTea = new Tea();
		Tea anotherCup = new Tea(true, "bottle", "green");
		
		//print out the container for a tea drink
		System.out.println(cupOfTea.getContainer());
		
		//print them out to the Java console
		System.out.println(cupOfTea.toString());
		System.out.println(anotherCup.toString());
	}
}
