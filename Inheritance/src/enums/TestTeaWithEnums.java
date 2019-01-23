package enums;

public class TestTeaWithEnums
{
	public static void main(String[] args)
	{
		//verify the type of tea by using an enum
		Tea myTea = new Tea(true, "cup", TeaType.GREEN);
		System.out.println(myTea);
	}
}
