public class forStatement2
{
	public static void main(String[] args)
	{
		
		/*
		System.out.println("$10,000 at 2% interest = " + calculateInterest(10000, 2.00) + " $");
		System.out.println("$10,000 at 3% interest = " + calculateInterest(10000, 3.00) + " $");
		System.out.println("$10,000 at 4% interest = " + calculateInterest(10000, 4.00) + " $");
		System.out.println("$10,000 at 5% interest = " + calculateInterest(10000, 5.00) + " $");
		*/


		for(int i=2; i < 9; i++)
		{
			System.out.println("$10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0, i)) + " $");
			//String.format("%.2f" will force to have 2 decimals
		}

		System.out.println("------------------------");

		for(int i=8; i > 1; i--)
		{
			System.out.println("$10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0, i)) + " $");
			//String.format("%.2f" will force to have 2 decimals
		}


	}

	public static double calculateInterest(double amount, double interestRate)
	{
		return(amount * (interestRate/100));
	}
}