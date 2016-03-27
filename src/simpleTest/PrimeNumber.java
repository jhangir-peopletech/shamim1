package simpleTest;

public class PrimeNumber {
	final int NUMBER_OF_PRIMES = 50;
	final int NUMBER_OF_PRIMES_PER_LINE = 10; //DISPLAY 10 PER LINE
	int count = 0; //count the number of prime
	int number = 2; // A number to be tested for primeness
	System.out.println("The first 50 prime numbers are \n");
	// Repeatedly find prime number
	while (count < NUMBER_OF_PRIMES)
	{
		// Assume the number is prime
		boolean isPrime = true; // Is  the current number  prime?
		// Test weather number is prime
		for (int divisor = 2; divisor <= number / 2; divisor++)
		{
			if (number % divisor == 0)
			{ //if true, number is not prime
				isPrime = false;
				break;
			}
		}
		// print the prime number ans increase the count
		if (isPrime)
		{
			count++; // Increase the count
			if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
			{
				//pRINT the number and advance to the new line
				System.out.print(number);
		
			}
			else 
				System.out.print(number + " ");
		}
			// CHECK if the next number is prime
		number++;
				
	
			}
		
	}


