public class dayOfWeek
{
	public static void main(String[] args)
	{
		printMainOfTheWeek(1);
		printMainOfTheWeek(-1);
		printMainOfTheWeek(3);
		printMainOfTheWeek(7);
		printMainOfTheWeek(5);
		

	}

	private static void printMainOfTheWeek(int day)
	{
		
		

		switch(day)
		{
			case 0:
			System.out.println("Sunday");
			break;

			case 1:
			System.out.println("Monday");
			break;

			case 2:
			System.out.println("Tuesday");
			break;

			case 3:
			System.out.println("Wednesday");
			break;

			case 4:
			System.out.println("Thursday");
			break;

			case 5:
			System.out.println("Friday");
			break;

			case 6:
			System.out.println("Saturday");
			break;
			
			default:
			System.out.println(day + " Is an invalid day");
			break;

			
		}
	}


}