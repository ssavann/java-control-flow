public class switch1
{

	public static void main(String[] args)
	{

		int switchValue = 4;

		switch(switchValue)
		{
			case 1:
			System.out.println("Value was 1");
			break;

			case 2:
			System.out.println("Value was 2");
			break;

			case 3: case 4: case 5:
			System.out.println("Value was " + switchValue);
			break;

			default:
			System.out.println("Value is not valid");
			break;

			
		}
	}


}