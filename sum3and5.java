public class sum3and5
{
	public static void main(String[] args)
	{
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 1000; i++)
		{
			
			//find number that is devided by 3 and 5, but has no remainder
			if((i % 3 == 0) && (i % 5 == 0))
			{
				count++;
				sum += i;
				System.out.println("Found number = " + i);
			}

			if(count == 5)	//once I got 5 numbers, I can exit the program
			{
				break;
			}
		}

		System.out.println("Sum " + sum);

	}

	

}