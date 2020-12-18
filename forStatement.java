public class forStatement
{
	public static void main(String[] args)
	{
		System.out.println("$10,000 at 2% interest = " + calculateInterest(10000, 2.00) + " $");
		System.out.println("$10,000 at 3% interest = " + calculateInterest(10000, 3.00) + " $");
		System.out.println("$10,000 at 4% interest = " + calculateInterest(10000, 4.00) + " $");
		System.out.println("$10,000 at 5% interest = " + calculateInterest(10000, 5.00) + " $");

	}

	public static double calculateInterest(double amount, double interestRate)
	{
		return(amount * (interestRate/100));
	}
}