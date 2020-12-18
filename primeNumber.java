public class primeNumber
{
	public static void main(String[] args)
	{
		isPrime(2);
		isPrime(50);
		isPrime(10);
		isPrime(13);
		isPrime(44);

		System.out.println("------------------");

		//will check for 50 numbers, if they are prime or not
		int count = 0;
		for(int i = 10; i < 50; i++)
		{
			
			//if true, it will execute the isPrime method
			if(isPrime(i))
			{
				count++;
				System.out.println("Number " + i + " is a prime number");
				if(count == 10)	//count == 10 : how many prime number you want to see?
				{
					//once it reached 10 prime numbers, it will exit the loop
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
	}

	public static boolean isPrime(int n)
	{
		if(n == 1)
		{
			System.out.println(n + " is not a prime number");
			return false;
		}

		for (int i = 2; i <= n/2; i++)
		{
			if(n % i == 0 )
			{
				
				System.out.println(n + " is not a prime number");
				return false;
			}
		}

		System.out.println(n + " is a prime number");
		return true;
	}
}